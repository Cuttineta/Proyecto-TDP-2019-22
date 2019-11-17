package Tienda;

import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Juego.Juego;

public class tienda {

	protected int monedas;
	protected Aliado aColocar;
	private static tienda miTienda;
	protected Juego juego;
	
	public static tienda getTienda(Juego juego) {
		if (miTienda == null) {
			miTienda = new tienda(juego);
		}
		return miTienda;	
	}
	
	private tienda(Juego juego) {
		this.juego = juego;
		monedas = 150;
	}
	
	public void setPersonajeAColocar(Aliado aliado) {
		if (puedoComprarAliado(aliado)) {
			aColocar = aliado;
			monedas -=aliado.getPrecio();
		}
	}
	
	public Aliado getPersonajeAColocar() {
		Aliado toReturn = aColocar;
		aColocar = null;
		return toReturn;
	}
	
	public int getMonedas() {
		return monedas;		
	}
	
	public void sumarMonedas(int recompensa) {
		monedas += recompensa;
	}
	
	private boolean puedoComprarAliado(Aliado aliado) {
		return monedas>=aliado.getPrecio();
	}
	
}
