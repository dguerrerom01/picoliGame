package control.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import control.Game;
import control.ParaUI;
import control.acciones.Baraja;
import modelo.Colores;

public class BarajableTest {

	@Test
	public void testReordenarPilas() {
		Game game = new Game();
		Baraja inst = new Baraja(game);
		ParaUI para = new ParaUI();

		for (int i = 0; i < 5; i++) {
			game.dameCollecctionPila().add(game.darColorRandom());
			game.dameCollecctionPilaDos().add(game.darColorRandom());
		}

		Object[] pilaT = game.dameCollecctionPila().toArray();
		Object[] pilaDosT = game.dameCollecctionPilaDos().toArray();
		Object[] pila = game.dameCollecctionPila().toArray();
		Object[] pilaDos = game.dameCollecctionPilaDos().toArray();
		
		assertArrayEquals(pilaT, pila);
		assertArrayEquals(pilaDosT, pilaDos); //son iguales
		
		inst.reordenarPilas(para.getBotones().get(2));
		 pila = game.dameCollecctionPila().toArray();
		 pilaDos = game.dameCollecctionPilaDos().toArray();
		assertNotEquals(pilaT, pila);
		assertNotEquals(pilaDosT, pilaDos); // son diferentes
	}

}
