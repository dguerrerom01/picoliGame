package control.interfaces;

import javax.swing.JButton;

import control.ParaUI;
import modelo.Colores;

public interface Pedible {
	/**
	 * te da a elegir entre los 5 colores e introduce el seleccionado
	 * 5 usos
	 * @return 
	 */
	Colores pedirMoneda(ParaUI paraUI);



}
