package control.acciones;

import javax.swing.JButton;

import control.ParaUI;
import control.interfaces.Pedible;
import modelo.Colores;

public class Pide implements Pedible{
	private int usos = utiles.Constantes.PETICION_COLOR_MAX; 
	@Override
	public Colores pedirMoneda(ParaUI paraUI) {
		JButton jButton=paraUI.getBotones().get(1);
		if (usos>0) {
			usos--;
			jButton.setText("Pedir Color (x"+usos+")");
			Colores color=(Colores) paraUI.getComboPedir().getSelectedItem();
			return color;
		}
		return null;
	}

}
