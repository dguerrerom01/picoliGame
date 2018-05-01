package control.acciones;

import java.util.Collection;
import java.util.Iterator;

import control.ParaUI;
import modelo.Colores;
import vista.JLabelModel;

public class Actualiza {
	ParaUI ParaUI;
	
	
	public Actualiza(control.ParaUI paraUI) {
		super();
		ParaUI = paraUI;
	}

	public void refresh() {
		ParaUI.getPanelCola().revalidate(); 
		ParaUI.getPanelPilaUno().revalidate();
		ParaUI.getPanelPilaDos().revalidate();
		ParaUI.getPanelLista().revalidate();
	}

	public void actualizaLista(Collection<Colores> lista) {
		ParaUI.getPanelLista().removeAll();
		
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			ParaUI.getPanelLista().add(new JLabelModel(colores.getColor())); 
		}
		ParaUI.getPanelLista().repaint();
	}

	public void actualizaCola(Collection<Colores> cola) {
		ParaUI.getPanelCola().removeAll();
		for (Iterator iterator = cola.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			ParaUI.getPanelCola().add(new JLabelModel(colores.getColor())); 
		}
	}

	public void actualizaPila(Collection<Colores> pila) {
		ParaUI.getPanelPilaUno().removeAll();
		for (Iterator iterator = pila.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			ParaUI.getPanelPilaUno().add(new JLabelModel(colores.getColor())); 
		}
	}
	
	public void actualizaPilaDos(Collection<Colores> pila) {//TODO posible mejora a un solo metodo
		ParaUI.getPanelPilaDos().removeAll();
		for (Iterator iterator = pila.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			ParaUI.getPanelPilaDos().add(new JLabelModel(colores.getColor())); 
		}
	}
}
