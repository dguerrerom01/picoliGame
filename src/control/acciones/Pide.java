package control.acciones;

<<<<<<< HEAD
import control.interfaces.Pedible;
=======
import java.util.Collection;
import java.util.Iterator;

import control.ParaUI;
import control.interfaces.Pedible;
import modelo.Colores;
import vista.JLabelModel;
>>>>>>> parent of 7999c3c... end

public class Pide implements Pedible{

	@Override
<<<<<<< HEAD
	public boolean pedirMoneda() {
		// TODO Auto-generated method stub
		return false;
=======
	public Colores pedirMoneda(ParaUI paraUI) {
		Collection<Colores> cola = paraUI.getGame().dameCollecctionCola();
		Colores color=Colores.amarillo;
		paraUI.getGame().addMonedaEnCola(color);
		Colores ultimoColor=paraUI.getGame().removeMonedaEnCola();
		System.out.println(ultimoColor);
		for (Iterator iterator = cola.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			paraUI.uicola.add(new JLabelModel(colores.getColor()));
		}
		System.out.println(cola);
		paraUI.uicola.revalidate();
		return ultimoColor;
>>>>>>> parent of 7999c3c... end
	}

}
