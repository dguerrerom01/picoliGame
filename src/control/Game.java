package control;

import java.util.Collection;

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
	public void addMonedaEnCola(Colores color){
		datos.getCola().encolar(color);
	}
	

	@Override
	public void addMonedaEnPila() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMonedaEnLista(Colores color) {
		datos.getLista().encolar(color);
	}

	@Override
	public Colores removeMonedaEnCola() {
		return datos.getCola().desencolar();
		
	}

	@Override
	public void removeMonedaEnPila() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprobarIgualesEnLista() {
		datos.getLista().deduplicar();
		
	}

	@Override
	public void borrarMonedaEnLista() {
		// TODO Auto-generated method stub
		// Boton de borrarColor
		
	}

	@Override
	public void incrementarMonedas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean comprobarWin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarLose() {
		// TODO Auto-generated method stub
		return false;
	}

	public Collection<Colores> dameCollecctionCola() {
		return getDatos().getCola().getCollectionCola();
	}
	
	
//	public Collection<Colores> dameValoresLista() {		
//		return getDatos().getLista().getLista();
//	}


}
