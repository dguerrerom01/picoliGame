package control.acciones;

import java.util.Collection;
import java.util.Iterator;

import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.swing.JButton;
import javax.swing.JLabel;

import control.ParaUI;
import control.interfaces.Borrable;
import modelo.Colores;
import modelo.Lista;
import vista.JLabelModel;

public class Borra implements Borrable{
	private int usos= utiles.Constantes.PETICION_BORRAR_MAX;

	@Override
	public boolean borrarColor(ParaUI paraUI) {
		Lista<Colores> lista =paraUI.getGame().getDatos().getLista();
		JLabel jLabel=paraUI.getLblMonedas();
		 JButton jButton=paraUI.getBotones().get(3);
		
		if (usos>0) {
			usos--;
				jButton.setText("Borrar Color (x"+usos+")");
				Colores color= (Colores) paraUI.getComboBorrar().getSelectedItem();
				paraUI.getGame().removeColorEnLista(color);
				int puntos = lista.borrarIgualesLindates();
				puntos+=Integer.valueOf(jLabel.getText());
				jLabel.setText(String.valueOf(puntos));
			return true;
		}
		
		return false;
	}

}
