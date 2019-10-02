package Aliado;

import java.awt.Point;

import Entidad.Personaje;

public abstract class Aliado extends Personaje {

	protected boolean esperando;
	protected int precio;

	public Aliado(int x, int y) {
		super(x,y);
		vida = MAX_VIDA;
		esperando = true;
	}

	/*
	 * Retorna el estado del personaje. Si esta en espera, no atacara. Caso
	 * contrario, comenzara a disparar
	 */
	public abstract boolean enEspera();
	
	public abstract int getPrecio();

}
