package control.acciones;

import java.util.Collection;
import java.util.Iterator;

import control.ParaUI;
import control.interfaces.Pedible;
import modelo.Colores;
import vista.JLabelModel;

public class Pide implements Pedible{

	@Override
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
	}

}
