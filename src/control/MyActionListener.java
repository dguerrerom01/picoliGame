package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DatabaseMetaData;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Colores;

public class MyActionListener implements ActionListener {

	private ParaUI paraUI;

	public MyActionListener(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton boton = (JButton) e.getSource();
		assert boton != null : "boton null";
		if (boton.getName().equals("btnSeleccionarColor")) {
			paraUI.getSeleccion().seleccionarMoneda(paraUI);
		} else if (boton.getName().equals("btnPedirColor")) {
			Colores temp = paraUI.getPide().pedirMoneda(paraUI);
			paraUI.jugar(temp);
		} else if (boton.getName().equals("btnBarajarPilas")) {
			if (paraUI.getBaraja().reordenarPilas(paraUI.getBotones().get(2))) {
			}
			paraUI.actualiza.actualizaPila(paraUI.getGame().dameCollecctionPila());// TODO corregir esto
			paraUI.actualiza.actualizaPilaDos(paraUI.getGame().dameCollecctionPilaDos());
			paraUI.actualiza.refresh();

		} else if (boton.getName().equals("btnBorrarColor")) {
			if (paraUI.getBorra().borrarColor(paraUI)) {
				paraUI.actualiza.actualizaLista(paraUI.getGame().dameCollecctionLista());
				paraUI.actualiza.refresh();
			}

		} else if (boton.getName().equals("btnOKSeleccion")) {
			paraUI.jugar(paraUI.getSeleccion().elegirColor(paraUI));
		}

	}

}
