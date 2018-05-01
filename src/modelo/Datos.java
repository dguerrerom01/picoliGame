package modelo;

public class Datos {

	private Cola<Colores> cola;
	private Lista<Colores> lista;
	private Pila<Colores> pila;
	private Pila<Colores> pilaDos;
	
	public Datos() {
		super();
		cola = new Cola<>();
		lista = new Lista<>();
		pila = new Pila<>();
		pilaDos= new Pila<>();
	}

	public Lista<Colores> getLista() {
		return lista;
	}

	public Pila<Colores> getPila() {
		return pila;
	}

	public Cola<Colores> getCola() {
		return cola;
	}

	public Pila<Colores> getPilaDos() {
		return pilaDos;
	}

}
