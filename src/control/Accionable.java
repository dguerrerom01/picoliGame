package control;

import modelo.Colores;

public interface Accionable {

	public boolean seleccionarMoneda();
	
	public boolean pedirMoneda();
	
	public boolean reordenarLista();
	
	public boolean borrarColor(Colores Color);
}
