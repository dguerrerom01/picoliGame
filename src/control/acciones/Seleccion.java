package control.acciones;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

import control.Game;
import control.ParaUI;
import control.interfaces.Seleccionable;
import modelo.Cola;
import modelo.Colores;
import vista.JLabelModel;

public class Seleccion implements Seleccionable{
	
	@Override
	public Colores seleccionarMoneda(ParaUI paraUI) {
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
