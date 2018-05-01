package modelo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import vista.JLabelModel;

public class Lista<Colores> {
	private LinkedList<Colores> lista = new LinkedList<>();

	public void encolar(Colores color) {
		this.lista.add(color);
	}

	public Colores desencolar(int index) {
		return this.lista.remove(index);
	}

	public Collection<Colores> getCollectionLista() {
		return this.lista;
	}

	public int borrarIgualesLindates() {
		int puntos=0;
		int size = lista.size();
		for (int i = 1; i < size; i++) {
			if (this.lista.get(i).equals(this.lista.get(i - 1))) {
				puntos++;
				quitarYPonerNull(i);
				quitarYPonerNull(i - 1);
			}
		}
		quitarNulls(size);
		return puntos;
	}

	public void borrarColor(Colores color) {
		int size = lista.size();
		for (int i = 0; i < size; i++) {
			if (this.lista.get(i).equals(color)) {
				quitarYPonerNull(i);
			}
		}
		quitarNulls(size);
	}
	

	
	private void quitarNulls(int size) {
		for (int i = size - 1; i >= 0; i--) {
			if (lista.get(i) == null) {
				lista.remove(i);
			}
		}
	}

	private void quitarYPonerNull(int i) {
		lista.remove(i);
		lista.add(i, null);
	}
}
