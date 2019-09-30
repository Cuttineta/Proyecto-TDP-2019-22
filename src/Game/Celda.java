package Game;

import Entidad.Entidad;

public class Celda {
	protected int x;
	protected int y;
	protected Entidad entidad;
	protected Mapa miMapa;

	public Celda(int x, int y, Mapa m) {
		miMapa = m;
		this.x = x;
		this.y = y;
	}

	/*
	 * Retorna la fila de la celda
	 */
	public int getX() {
		return x;
	}
	/*
	 * Retorna la columna de la celda
	 */

	public int getY() {
		return y;
	}

	public void agregarEntidad(Entidad e) {
		entidad = e;
	}

	public void quitarEntidad() {
		entidad = null;
	}

	public Entidad getEntidad() {
		return entidad;
	}

}
