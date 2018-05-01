package control.acciones;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import control.ParaUI;
import control.interfaces.Seleccionable;
import modelo.Colores;
import utiles.Constantes;

public class Seleccion implements Seleccionable {
	Stack<Colores> coloresUsados=new Stack<>();

	ArrayDeque<Colores> ultimosCinco = new ArrayDeque<>();
	private int turno = 0;

	@Override
	public void seleccionarMoneda(ParaUI paraUi) {
		ArrayDeque<Colores> cola=paraUi.getGame().dameCollecctionCola();
		paraUi.getComboBox().removeAllItems();

			for (int i = 0; i < 3; i++) {
				Colores posibleColor = paraUi.getGame().darColorRandom();

				if (noRepetido(posibleColor)&&(noSeleccionado(posibleColor,ultimosCinco))) {
					paraUi.getComboBox().addItem(posibleColor);
					coloresUsados.add(posibleColor);
				} else {
					i--;
				}
			}
		
	}

	private boolean noSeleccionado(Colores posibleColor, ArrayDeque<Colores> ultimosCinco) {
		int i=0;
		for (Iterator iterator = ultimosCinco.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			if (posibleColor.equals(colores)) {
				i++;
			}
		}
		if (i>1) {
			return false;
		}else{
			return true;
		}
	}

	private boolean noRepetido(Colores posibleColor) {
		System.out.println(coloresUsados);
		for (Iterator iterator = coloresUsados.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			if (posibleColor.equals(colores)) {
				return false;
			}
		}
		return true;
	}

	public Colores elegirColor(ParaUI paraUi) {
		coloresUsados.removeAllElements();
		ultimosCinco.add((Colores) paraUi.getComboBox().getSelectedItem());
		if (ultimosCinco.size()>=6) {
			ultimosCinco.removeFirst();
		}
		return (Colores) paraUi.getComboBox().getSelectedItem();
	}
}
