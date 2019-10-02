package Entidad;

import java.awt.Point;

public abstract class Personaje extends Entidad {

	protected static final int MAX_VIDA = 100;
	protected int vida, impacto, alcance;

	public Personaje(Point p) {
		super(p);
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
}
