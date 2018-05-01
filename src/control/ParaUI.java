package control;

import java.util.Collection;
import java.util.Iterator;

import javax.swing.JButton;

import control.acciones.Actualiza;
import control.acciones.Baraja;
import control.acciones.Borra;
import control.acciones.Pide;
import control.acciones.Seleccion;
import modelo.Cola;
import modelo.Colores;
import modelo.Pila;
import vista.JLabelModel;
import vista.UI;

public class ParaUI extends UI{
	private Game game = new Game();
	private MyActionListener listener=new MyActionListener(this);;
	private Seleccion seleccion= new Seleccion();
	private Pide pide= new Pide();
	private Baraja baraja= new Baraja(game);
	private Borra borra= new Borra();
	public Actualiza actualiza = new Actualiza(this);;
	public ParaUI() {
		super();
		for (Iterator iterator = botones.iterator(); iterator.hasNext();) {
			 JButton boton = (JButton) iterator.next();
			 boton.addActionListener(listener);
		}
		prepararGame();
	}

	protected void jugar(Colores color) {
		assert  color!=null:"color null";
		Collection<Colores> cola = game.dameCollecctionCola(); //coge la cola actual
		game.addMonedaEnCola(color); 
		Colores ultimoColorCola=game.removeMonedaEnCola(); //sale de cola el ultimo color
		this.getPanelCola().removeAll(); //se borra la cola visualmente
		System.out.println("color que sale de la cola "+ultimoColorCola);
		actualiza.actualizaCola(cola);//se pinta la cola visualmente
		System.out.println("cola "+cola);

		Pila <Colores> objpila = game.dameObjPila(); //coge la pila actual
		Pila <Colores> objpilaDos = game.dameObjPilaDos();//coge la pilaDos actual
		// a prtir de aqui tendria que ir en el metodo elegirPila, ya que entraria random en una
		elegirPila(ultimoColorCola, objpila, objpilaDos);
		//hasta aqui iria en el metodo elegirPila 
		System.out.println("pila "+objpila.getCollectionPila());
		System.out.println("pilados"+objpilaDos.getCollectionPila());
		actualiza.refresh();
		progressBar.setValue(getPanelLista().getComponents().length );
		switch (getGame().comprobarTermina(getLblMonedas().getText(),getPanelLista().getComponents().length )) {
		case 1:
			System.out.println("gana");
			terminarGame("has Ganado");
			break;
		case 2:
			System.out.println("pierde");
			terminarGame("has Perdido");
			break;
		case 3:
			//sigue jugando
			break;
		}
	}

	private void terminarGame(String string) {
		assert  string!=null || string.isEmpty():"string mensaje null/empty";
		lblContenidoMensaje.setText(string);
		for (Iterator iterator = botones.iterator(); iterator.hasNext();) {
			 JButton boton = (JButton) iterator.next();
			 boton.setEnabled(false);
		}
	}

	private void jugadaPila(Colores ultimoColorCola, Pila<Colores> pila) {
		assert  ultimoColorCola!=null:"lastColorCola null";
		assert  pila!=null:"pila null";
		game.addMonedaEnPila(pila,ultimoColorCola); //entra en la pila el color sacado de la cola
		if (pila.getCollectionPila().size()>utiles.Constantes.TAMANO_PILA) {
			Colores ultimoColorPila = game.removeMonedaEnPila(pila);
			System.out.println("color que sale de la pila "+ultimoColorPila);
			if (!(ultimoColorPila==null)) {
				Collection <Colores> lista = game.dameCollecctionLista(); // coge la lista actual
				game.addMonedaEnLista(ultimoColorPila);
				int puntos = game.datos.getLista().borrarIgualesLindates();
				puntos+=Integer.valueOf(getLblMonedas().getText());
				getLblMonedas().setText(String.valueOf(puntos));
				progressBarMonedas.setValue(puntos);
				this.getPanelLista().removeAll();
				actualiza.actualizaLista(lista);
				System.out.println("lista "+lista);
			}
		}
	}



	private void elegirPila(Colores ultimoColorCola, Pila<Colores> pila, Pila<Colores> pilaDos) { // metodo que elige la pila 
		assert  ultimoColorCola!=null:"lastColorCola null";
		assert  pila!=null:"pila null";
		assert  pilaDos!=null:"pilaDos null";
		if ((int) (Math.random()*10)%2==0) {
			this.getPanelPilaUno().removeAll();
			jugadaPila(ultimoColorCola, pila);
			actualiza.actualizaPila(pila.getCollectionPila());
		}else{
			this.getPanelPilaDos().removeAll();
			jugadaPila(ultimoColorCola, pilaDos);
			actualiza.actualizaPilaDos(pilaDos.getCollectionPila());
		}
		
	}
	private void prepararGame() {
		for (int i = 0; i < utiles.Constantes.TAMANO_COLA; i++) {
			Colores color = getGame().darColorRandom();
			assert color!=null:"color null en cola inicial";
			game.addMonedaEnCola(color);
			this.getPanelCola().add(new JLabelModel(color.getColor()));
		}
	}
	

	public Game getGame() {
		return game;
	}
	public MyActionListener getListener() {
		return listener;
	}
	public Seleccion getSeleccion() {
		return seleccion;
	}
	public Pide getPide() {
		return pide;
	}
	public Baraja getBaraja() {
		return baraja;
	}
	public Borra getBorra() {
		return borra;
	}
	
	
}
