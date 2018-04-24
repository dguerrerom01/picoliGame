package control.interfaces;

import control.ParaUI;
import modelo.Colores;

public interface Seleccionable {
	/**
	 * da a elegir entre 3 colores e introduce el seleccionado
	 * @return 
	 */
	Colores seleccionarMoneda(ParaUI paraUI);
	
}
