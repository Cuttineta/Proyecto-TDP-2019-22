package Entidad.Enemigos;

import Entidad.Personaje;
import Mapa.mapa;
import Tienda.tienda;

public abstract class Enemigo extends Personaje {
	protected int recompensa;
	
	public int getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}

	public void eliminarDeLaLista() {
		mapa.getMapa().eliminarEnemigo(this);
	}
	
	public void mover() {		
		estado.mover();		
	}
	
}
