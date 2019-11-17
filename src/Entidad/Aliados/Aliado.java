package Entidad.Aliados;

import Entidad.Personaje;
import Mapa.mapa;

public abstract class Aliado extends Personaje {
	
	protected int rango;
	protected int precio;
	
	
	public int getRango() {
		return rango;
	}
	public void setRango(int rango) {
		this.rango = rango;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public void eliminarDeLaLista() {
		mapa.getMapa().eliminarAliado(this);
	}

	public void mover() {
	}
}
