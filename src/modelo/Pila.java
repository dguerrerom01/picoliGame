package modelo;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Stack;

public class Pila<Colores> {	
private Stack<Colores> pila = new Stack<>();

public void encolar(Colores color) {
	this.pila.add(color);
}
public Colores desencolar(){
	Colores temp = this.pila.firstElement();
	this.pila.remove(this.pila.firstElement());
	return temp;
}
public void barajar(){
	Stack<Colores> pilaTemp = new Stack<>();
	int size= pila.size();
	for (int i = 0; i < size; i++) {
		if ( (int) (Math.random()*10)%2==0 ) {
			pilaTemp.add(this.pila.firstElement());
			this.pila.remove(this.pila.firstElement());
		}else{
			pilaTemp.add(this.pila.lastElement());
			this.pila.remove(this.pila.lastElement());
		}
	}
	System.out.println("temp"+pilaTemp);
	this.pila=pilaTemp;
};

public Collection<Colores> getCollectionPila() {
	return this.pila;
}

}
