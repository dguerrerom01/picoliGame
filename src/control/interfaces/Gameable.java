package control.interfaces;

<<<<<<< HEAD
=======
import modelo.Colores;

>>>>>>> parent of 7999c3c... end
public interface Gameable {

	/**
	 * introduce una moneda en la cola
	 */
	public void addMonedaEnCola();

	/**
	 * introduce una moneda en la pila
	 */
	public void addMonedaEnPila();

	/**
	 * introduce una moneda en la lista
	 */
<<<<<<< HEAD
	public void addMonedaEnLista(Colores color);
=======
	public void addMonedaEnLista();
>>>>>>> parent of 7999c3c... end

	/**
	 * quita una moneda de la cola
	 */
	public void removeMonedaEnCola();

	/**
	 * quita una moneda de una de las pilas
	 */
	public void removeMonedaEnPila();

	/**
	 * comprueba si dos monedas consecutivas de la lista son iguales
	 */
	public void comprobarIgualesEnLista();

	/**
	 * elimina una moneda de la lista
	 */
	public void borrarMonedaEnLista();

	/**
	 * incrementa el numero de monedas(pts)
	 */
	public void incrementarMonedas();

	/**
	 * comprueba si ganas el juego, 
	 * @return true monedas(pts) >= requisito
	 */
	public boolean comprobarWin();

	/**
	 * comprueba si se pierde el juego
	 * @return true monedas > requisito
	 */
	public boolean comprobarLose();
<<<<<<< HEAD
=======


>>>>>>> parent of 7999c3c... end

}
