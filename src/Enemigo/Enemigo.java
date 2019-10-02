package Enemigo;

import Entidad.Personaje;

public abstract class Enemigo extends Personaje {

	protected int puntos, monedas, velocidad;
	protected boolean atacando;

	public Enemigo(int x, int y) {
		super(x,y);
	}

	/*
	 * Devuelve los puntos que deja un enemigo al ser destruido
	 */
	public abstract int getPuntos();

	/*
	 * Devuelve las monedas que deja un enemigo al ser destruido
	 */
	public abstract int getMonedas();

	/*
	 * Devuelve la velocidad con la que se desplaza el enemigo
	 */

	public abstract int getVelocidad();

	/*
	 * Devuelve el estado actual del enemigo. Esta atacando si y solo si tiene un
	 * aliado en la celda siguiente
	 */

	public abstract boolean atacando();
}
