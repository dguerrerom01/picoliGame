package control.test;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

import control.Game;
import modelo.Colores;
import utiles.Constantes;

public class GameableTest {
	Game inst = new Game();

	@Test
	public void testAddMonedaEnCola() {
		ArrayDeque<Colores> temp = new ArrayDeque<>();
		temp.add(Colores.amarillo);
		inst.addMonedaEnCola(Colores.amarillo);
		assertArrayEquals(temp.toArray(),inst.dameCollecctionCola().toArray() );
	}
	
	@Test
	public void testAddMonedaEnPila() {
		Stack<Colores> temp = new Stack<>();
		temp.add(Colores.amarillo);
		inst.addMonedaEnPila(inst.getDatos().getPila(), Colores.amarillo);
		assertArrayEquals(temp.toArray(),inst.dameCollecctionPila().toArray());
	}

	@Test
	public void testAddMonedaEnLista() {
		LinkedList<Colores> temp = new LinkedList<>();
		temp.add(Colores.amarillo);
		inst.addMonedaEnLista(Colores.amarillo);
		assertArrayEquals(temp.toArray(),inst.dameCollecctionLista().toArray());
	}

	@Test
	public void testRemoveMonedaEnCola() {
		ArrayDeque<Colores> temp = new ArrayDeque<>();
		inst.dameCollecctionCola().add(Colores.verde);
		inst.dameCollecctionCola().add(Colores.amarillo);
		temp.add(Colores.verde);
		inst.removeMonedaEnCola();
		assertArrayEquals(temp.toArray(),inst.dameCollecctionCola().toArray());
	}

	@Test
	public void testRemoveMonedaEnPila() {
		Stack<Colores> temp = new Stack<>();
		inst.dameCollecctionPila().add(Colores.amarillo);
		inst.dameCollecctionPila().add(Colores.verde);
		temp.add(Colores.verde);
		inst.removeMonedaEnPila(inst.dameObjPila());
		assertArrayEquals(temp.toArray(),inst.dameCollecctionPila().toArray());
	}

	@Test
	public void testComprobarWin() {
		for (int i = 0; i < 30; i++) {
			if (i < Constantes.CANTIDAD_MAX_MONEDAS) {
				assertFalse(inst.comprobarWin(i));
			} else {
				assertTrue(inst.comprobarWin(i));
			}
		}

	}

	@Test
	public void testComprobarLose() {
		for (int i = 0; i < 30; i++) {
			if (i < Constantes.TAMANO_LISTA_LADO*Constantes.TAMANO_LISTA_LADO) {
				assertFalse(inst.comprobarLose(i));
			} else {
				assertTrue(inst.comprobarLose(i));
			}
		}
	}
	
	@Test
	public void testRemoveColorEnLista(){
		LinkedList<Colores> temp = new LinkedList<>();
		temp.add(Colores.amarillo);
		temp.add(Colores.amarillo);
		temp.add(Colores.azul);
		temp.add(Colores.amarillo);
		temp.add(Colores.rojo);
		temp.add(Colores.amarillo);
		Collection<Colores> lista = inst.dameCollecctionLista();
		lista.add(Colores.amarillo);
		lista.add(Colores.verde);
		lista.add(Colores.amarillo);
		lista.add(Colores.azul);
		lista.add(Colores.amarillo);
		lista.add(Colores.rojo);
		lista.add(Colores.verde);
		lista.add(Colores.amarillo);
		inst.removeColorEnLista(Colores.verde);
		assertArrayEquals(temp.toArray(),lista.toArray());

	}
	
	@Test
	public void testComprobarTermina(){
		assertEquals(1, inst.comprobarTermina(String.valueOf(Constantes.CANTIDAD_MAX_MONEDAS), 5)); 
		assertEquals(2, inst.comprobarTermina(String.valueOf(5), Constantes.TAMANO_LISTA_LADO*Constantes.TAMANO_LISTA_LADO)); 
		assertEquals(3, inst.comprobarTermina(String.valueOf(5), 5)); 
	}

}
