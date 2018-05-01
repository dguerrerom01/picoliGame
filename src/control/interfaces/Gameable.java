package control.interfaces;

import modelo.Colores;
import modelo.Pila;

public interface Gameable {

	/**
	 * introduce una moneda en la cola
	 */
	void addMonedaEnCola(Colores color);

	/**
	 * introduce una moneda en la pila
	 */
	void addMonedaEnPila(Pila<Colores> pila, Colores color);

	/**
	 * introduce una moneda en la lista
	 */
	void addMonedaEnLista(Colores ultimoColorPila);

	/**
	 * quita una moneda de la cola
	 * @return 
	 */
	public Colores removeMonedaEnCola();

	/**
	 * quita una moneda de una de las pilas
	 * @return 
	 */
	Colores removeMonedaEnPila(Pila pila);

	/**
	 * comprueba si ganas el juego, 
	 * @return true monedas(pts) >= requisito
	 */
	boolean comprobarWin(int monedas);

	/**
	 * comprueba si se pierde el juego
	 * @return true monedas > requisito
	 */
	boolean comprobarLose(int cantidadLbls);










}
