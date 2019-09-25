package Entidad;

import Mapa.Celda;

public abstract class Personaje extends Entidad {

	protected static final int MAX_VIDA = 100;
	protected int vida, impacto, alcance, valor;

	public Personaje(Celda c) {
		super(c);
	}

	/*
	 * Retorna la vida del personaje
	 */
	public abstract int getVida();

	/*
	 * Retorna la fuerza de impacto del personaje
	 */

	public abstract int getImpacto();
	/*
	 * Retorna el alcance que tiene el personaje
	 */

	public abstract int getAlcance();

	/*
	 * Retorna el valor que tiene el personaje en la tienda
	 */

	public abstract int getValor();
}
