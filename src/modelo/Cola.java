package modelo;

import java.util.ArrayDeque;
import java.util.Collection;

public class Cola<T> {
	private ArrayDeque<T> cola = new ArrayDeque<>();

	public void encolar(T t) {
		this.cola.push(t);
	}
	public T desencolar(){
		T temp = cola.getLast();
		this.cola.removeLast();
		return temp;
	}
	public ArrayDeque<T> getCollectionCola(){
		return cola;
	}
}
