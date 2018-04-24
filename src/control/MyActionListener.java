package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	private ParaUI paraUI;

	public MyActionListener(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton boton = (JButton) e.getSource();
		
		if (boton.getName().equals("btnSeleccionarColor")) {
			
			paraUI.toSeleccion();
			
		} 
//			else if (boton.getName().equals("btnElegirColor")) {
//			
//			paraUI.getPide().pedirMoneda();
//			
//		} else if (boton.getName().equals("btnBarajarFilas")) {
//			
//			paraUI.getBaraja().reordenarPilas();
//			
//		} else if (boton.getName().equals("btnBorrarColor")) {
//			
//			paraUI.getBorra().borrarColor();
//			
//		}
		
		
	}

}
