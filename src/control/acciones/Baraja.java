package control.acciones;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Stack;

import javax.swing.JButton;

import control.Game;
import control.ParaUI;
import control.interfaces.Barajable;
import modelo.Colores;

public class Baraja implements Barajable{
	private int usos= utiles.Constantes.PETICION_BARAJAR_MAX;
	private Game game;
	
	public Baraja(Game game) {
		this.game=game;
	}
	
	@Override
	public boolean reordenarPilas(JButton jButton) {
		if (usos>0) {
			usos--;
			jButton.setText("Barajar Pilas (x"+usos+")");
			System.out.println(game.getDatos().getPila().getCollectionPila());
			game.getDatos().getPila().barajar();  
			game.getDatos().getPilaDos().barajar();  
			Stack<Colores> pila =  (Stack<Colores>) game.getDatos().getPila().getCollectionPila();
			Stack<Colores> pilaDos =  (Stack<Colores>) game.getDatos().getPilaDos().getCollectionPila();
			return true;
		}
		
		return false;
	}

}
