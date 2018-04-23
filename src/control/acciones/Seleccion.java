package control.acciones;

import control.interfaces.Seleccionable;

public class Seleccion implements Seleccionable{

	@Override
	public boolean seleccionarMoneda() {
		System.out.println("s");
		return false;
	}

}
