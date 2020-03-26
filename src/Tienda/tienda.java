package Tienda;

import Entidad.Entidad;
import Juego.Juego;
import PowerUp.PowerUp;

public class tienda {

	protected int monedas;
	protected Entidad aColocar,aColocarAux;
	protected PowerUp poweraColocar;
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
	
	public void setPowerAColocar(PowerUp p) {
		if (puedoComprar(p)) {
			poweraColocar = p;
		}
	}
	
	public PowerUp getPowerAColocar() {
		PowerUp toReturn = poweraColocar;
		poweraColocar = null;
		return toReturn;
	}
	
	public void setEntidadAColocar(Entidad entidad) {
		if (puedoComprar(entidad)) {
			aColocar = entidad;
		}
	}
	
	public Entidad getEntidadAColocar() {
		Entidad toReturn = aColocar;
		aColocar = null;
		return toReturn;
	}
	public void setPersonajeAColocarAux(Entidad entidad) {
		if (puedoComprar(entidad)) {
			aColocarAux = entidad;
		}
	}
	
	public Entidad getEntidadAColocarAux() {
		Entidad toReturn = aColocarAux;
		aColocarAux = null;
		return toReturn;
	}
	
	public int getMonedas() {
		return monedas;		
	}
	
	public void reiniciarMonedas() {
		monedas = 150;		
	}
	
	public void sumarMonedas(int recompensa) {
		monedas += recompensa;
		juego.actualizarMonedas();
	}
	
	public void restarMonedas(int resta) {
		monedas -= resta;
	}
	private boolean puedoComprar(Entidad entidad) {
		juego.actualizarMonedas();
		return monedas>=entidad.getPrecio();
	}
	
}
