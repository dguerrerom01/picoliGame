package modelo;

import java.util.Collection;
import java.util.LinkedList;

public class Lista<T> {
	private LinkedList<T> lista = new LinkedList<>();

	public void encolar(T t) {
		this.lista.add(t);
	}

	public T desencolar(int index) {
		return this.lista.remove(index);
	}

	public void deduplicar() {
		for (int i = 0; i < lista.size() - 1; i++) {
			if (lista.get(i).equals(lista.get(i + 1))) {
				lista.remove(i);
				lista.remove(i + 1);
				i = -1;
			}
		}
	}

	public Collection<T> getLista() {
		return lista;
	}

}
