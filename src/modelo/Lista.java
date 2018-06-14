package modelo;

import java.util.Collection;
import java.util.LinkedList;

<<<<<<< HEAD
public class Lista<T> {
	private LinkedList<T> lista = new LinkedList<>();

	public void encolar(T t) {
		this.lista.add(t);
	}

	public T desencolar(int index) {
		return this.lista.remove(index);
	}

	public void borrarDuplicados() {
		for (int i = 0; i < lista.size() - 1; i++) {
			if (lista.get(i).equals(lista.get(i + 1))) {
				lista.remove(i);
				lista.remove(i);
				i = -1;
			}
		}
	}

	public Collection<T> getLista() {
		return lista;
	}

=======
public class Lista<T> {	
	private LinkedList<T> lista = new LinkedList<>();

public void encolar(T t) {
	this.lista.add(t);
}
public T desencolar(int index){
	return this.lista.remove(index);
}
public Collection<T> getLista(){
	return lista;
}

>>>>>>> parent of 7999c3c... end
}
