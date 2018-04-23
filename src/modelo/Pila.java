package modelo;

import java.util.ArrayDeque;
import java.util.Collection;

public class Pila<T> {	
private ArrayDeque<T> pila = new ArrayDeque<>();

public void encolar(T t) {
	this.pila.addLast(t);
}
public T desencolar(){
	return this.pila.removeFirst();
}
public Collection<T> getPila(){
	return pila;
}

}
