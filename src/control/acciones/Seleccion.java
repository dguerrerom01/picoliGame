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
<<<<<<< HEAD

public class Seleccion implements Seleccionable{
=======
>>>>>>> parent of 7999c3c... end

public class Seleccion implements Seleccionable{
	
	@Override
	public Colores seleccionarMoneda(ParaUI paraUI) {
<<<<<<< HEAD
		ArrayDeque<Colores> cola = paraUI.getGame().getDatos().getCola().getCollectionCola();
		Colores color=Colores.amarillo;
		paraUI.getGame().addMonedaEnColaT(color); //TODO cambiar
		Colores ultimoColor=cola.getLast();
		paraUI.getGame().removeMonedaEnCola();
=======
		Collection<Colores> cola = paraUI.getGame().dameCollecctionCola();
		Colores color=Colores.amarillo;
		paraUI.getGame().addMonedaEnCola(color);
		Colores ultimoColor=paraUI.getGame().removeMonedaEnCola();
>>>>>>> parent of 7999c3c... end
		System.out.println(ultimoColor);
		for (Iterator iterator = cola.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			paraUI.uicola.add(new JLabelModel(colores.getColor()));
		}
		System.out.println(cola);
		paraUI.uicola.revalidate();
		return ultimoColor;
	}
<<<<<<< HEAD
=======

>>>>>>> parent of 7999c3c... end

}
