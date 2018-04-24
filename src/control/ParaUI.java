package control;

import java.util.Collection;

import control.acciones.Baraja;
import control.acciones.Borra;
import control.acciones.Pide;
import control.acciones.Seleccion;
import modelo.Cola;
import modelo.Colores;
import vista.JLabelModel;
import vista.UI;

public class ParaUI extends UI{
	private Game game;
	private MyActionListener listener;
	private Seleccion seleccion= new Seleccion();
	private Pide pide= new Pide();
	private Baraja baraja= new Baraja();
	private Borra borra= new Borra();
	public ParaUI() {
		super();
		this.game = new Game();
		this.listener=new MyActionListener(this);
		uicola.getBtnSeleccionarColor().addActionListener(listener);
		prepararGame();
		jugar();
	}

	private void jugar() {
		
	}
	private void prepararGame() {
		for (int i = 0; i < utiles.Constantes.TAMANO_COLA; i++) {
			Colores color = darColorRandom();
			game.addMonedaEnColaT(color);//TODO
			this.uicola.getPanelColaColores().add(new JLabelModel(color.getColor()));
		}
//		Collection<Colores> cola = game.datos.getCola().getCola();
//		for (Colores colores : cola) {
//			this.uicola.getPanelColaColores().add(new JLabelModel(colores.getColor()));
//		}
	
		
	}
	private Colores darColorRandom() {
		switch ((int)(Math.random()*utiles.Constantes.CANTIDAD_COLORES_TOTALES + 1 )) {
		case 1:
			return Colores.amarillo;
		case 2:
			return Colores.verde;
		case 3:
			return Colores.naranja;
		case 4:
			return Colores.azul;
		case 5:
			return Colores.rojo;
		default:
			System.out.println("falla");
			return null;
		}

	}
	
	public void toSeleccion(){
		this.seleccion.seleccionarMoneda(this);
	}

	public Game getGame() {
		return game;
	}
	
	
}
