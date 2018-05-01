package control;

import java.util.ArrayDeque;
import java.util.Collection;

import javax.swing.text.Utilities;

import control.interfaces.Gameable;
import modelo.Colores;
import modelo.Datos;
import modelo.Pila;

public class Game implements Gameable {

	Datos datos;

	public Game() {
		super();
		datos = new Datos();
	}

	public Datos getDatos() {
		return datos;
	}

	@Override
	public void addMonedaEnCola(Colores color) {
		assert color != null : "color null";
		datos.getCola().encolar(color);
	}

	@Override
	public void addMonedaEnPila(Pila<Colores> pila, Colores color) {
		assert color != null : "color null";
		assert pila != null : "pila null";
		pila.encolar(color);

	}

	@Override
	public void addMonedaEnLista(Colores ultimoColorPila) {
		assert ultimoColorPila != null : "lastcolorPila null";
		datos.getLista().encolar(ultimoColorPila);

	}

	@Override
	public Colores removeMonedaEnCola() {
		return datos.getCola().desencolar();

	}

	@Override
	public Colores removeMonedaEnPila(Pila pila) {
		assert pila != null : "pila null";
		return (Colores) pila.desencolar();
	}

	@Override
	public boolean comprobarWin(int monedas) {
		assert (monedas >= 0) || (monedas <= 20) : "monedas value";
		if (monedas >= utiles.Constantes.CANTIDAD_MAX_MONEDAS) {
			return true;
		}
		return false;
	}

	@Override
	public boolean comprobarLose(int cantidadLbls) {
		assert (cantidadLbls >= 0) || (cantidadLbls <= utiles.Constantes.TAMANO_LISTA_LADO
				* utiles.Constantes.TAMANO_LISTA_LADO) : "cantidadLbls value";
		if (cantidadLbls >= utiles.Constantes.TAMANO_LISTA_LADO * utiles.Constantes.TAMANO_LISTA_LADO) {
			return true;
		}
		return false;
	}

	public ArrayDeque<Colores> dameCollecctionCola() {
		return getDatos().getCola().getCollectionCola();
	}

	public Pila<Colores> dameObjPila() {
		return getDatos().getPila();
	}

	public Pila<Colores> dameObjPilaDos() {
		return getDatos().getPilaDos();
	}

	public Collection<Colores> dameCollecctionLista() {
		return getDatos().getLista().getCollectionLista();
	}
	public Collection<Colores> dameCollecctionPila() {
		return getDatos().getPila().getCollectionPila();
	}
	public Collection<Colores> dameCollecctionPilaDos() {
		return getDatos().getPilaDos().getCollectionPila();
	}
	public Colores darColorRandom() {
		switch ((int)(Math.random()*utiles.Constantes.CANTIDAD_COLORES_TOTALES + 1 )) {
		case 1:
			return Colores.amarillo;
		case 2:
			return Colores.verde;
		case 3:
			return Colores.naranja;
		case 4:
			return Colores.azul;
		case 5:
			return Colores.rojo;
		default:
			return null;
		}

	}
	public int comprobarTermina(String puntos, int cantidadLbls) {
		assert puntos != null || puntos.isEmpty() : "puntos null/empty";
		int monedas = Integer.valueOf(puntos);
		if (comprobarWin(monedas)) {
			return 1;
		} else if (comprobarLose(cantidadLbls)) {
			return 2;
		} else {
			return 3;
		}

	}

	public void removeColorEnLista(Colores color) {
		datos.getLista().borrarColor(color);
		
	}

}
