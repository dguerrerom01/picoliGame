package control;

<<<<<<< HEAD
=======
import java.util.Collection;

>>>>>>> parent of 7999c3c... end
import control.interfaces.Gameable;
import modelo.Colores;
import modelo.Datos;

public class Game implements Gameable{

	Datos datos;

	public Game() {
		super();
		datos=new Datos();
	}
	
	public Datos getDatos() {
		return datos;
	}

	@Override
<<<<<<< HEAD
	public void addMonedaEnCola(){
		// TODO Auto-generated method stub
	}
	
	public void addMonedaEnColaT(Colores color) {//TODO borrar
=======
	public void addMonedaEnCola(Colores color){
>>>>>>> parent of 7999c3c... end
		datos.getCola().encolar(color);
	}
	

	@Override
	public void addMonedaEnPila() {
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void addMonedaEnLista(Colores color) {
		datos.getLista().encolar(color);
	}

	@Override
	public void removeMonedaEnCola() {
		datos.getCola().desencolar();
=======
	public void addMonedaEnLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Colores removeMonedaEnCola() {
		return datos.getCola().desencolar();
>>>>>>> parent of 7999c3c... end
		
	}

	@Override
	public void removeMonedaEnPila() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprobarIgualesEnLista() {
<<<<<<< HEAD
		datos.getLista().borrarDuplicados();
=======
		// TODO Auto-generated method stub
>>>>>>> parent of 7999c3c... end
		
	}

	@Override
	public void borrarMonedaEnLista() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		// Boton de borrarColor
		
	}

	@Override
	public void incrementarMonedas() {
		// TODO Auto-generated method stub
=======
>>>>>>> parent of 7999c3c... end
		
	}

	@Override
<<<<<<< HEAD
	public boolean comprobarWin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarLose() {
=======
	public void incrementarMonedas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean comprobarWin() {
>>>>>>> parent of 7999c3c... end
		// TODO Auto-generated method stub
		return false;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public Collection<Colores> dameCollecctionCola() {
		return getDatos().getCola().getCollectionCola();
=======
	@Override
	public boolean comprobarLose() {
		// TODO Auto-generated method stub
		return false;
>>>>>>> parent of 7999c3c... end
	}
	
	
//	public Collection<Colores> dameValoresLista() {		
//		return getDatos().getLista().getLista();
//	}

<<<<<<< HEAD
=======
	public Collection<Colores> dameCollecctionCola() {
		return getDatos().getCola().getCollectionCola();
	}
>>>>>>> parent of 7999c3c... end

=======
>>>>>>> parent of da497b5... a
}
