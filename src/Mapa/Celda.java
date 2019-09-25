package Mapa;

import javax.swing.JLabel;
import Entidad.Entidad;

public class Celda {
	protected int fila;
	protected int columna;
	protected JLabel grafico;
	protected Entidad[] misEntidades;
	protected int size;
	protected Mapa miMapa;
	protected boolean ocupado;

	public Celda(int fila, int columna, Mapa m) {
		miMapa = m;
		this.fila = fila;
		this.columna = columna;
		misEntidades = new Entidad[3];
		size = 0;
		ocupado = false;
		miMapa.setCelda(fila, columna, this);
	}

	/*
	 * Retorna la fila de la celda
	 */
	public int getFila() {
		return fila;
	}
	/*
	 * Retorna la columna de la celda
	 */

	public int getColumna() {
		return columna;
	}

	public JLabel getGrafico() {
		return grafico;
	}

	/*
	 * Retorna el mapa en el que estan las celdas
	 */
	public Mapa getMiMapa() {
		return miMapa;
	}

	/*
	 * Si la celda no esta ocupada, se agrega el aliado y la celda queda ocupada en
	 * su totalidad
	 * 
	 * @param e Entidad a agregar. En este caso, sera un aliado
	 */

	public void agregarAliado(Entidad e) {
		if (!ocupado) {
			misEntidades[size] = e;
			ocupado = true;
			size++;
		}
	}

	/*
	 * Si la celda no esta ocupada, se agrega un enemigo. La celda queda ocupada si
	 * y solo si la cantidad de enemigos en ella supera la capacidad de la misma
	 * 
	 * @param e Entidad a agregar. En este caso sera un enemigo
	 * 
	 */
	public void agregarEnemigo(Entidad e) {
		if (!ocupado) {
			misEntidades[size] = e;
			size++;
		}
		if (size == misEntidades.length) {
			ocupado = true;
		}
	}

	/*
	 * Elimina la primer entidad que se agrego a la celda
	 */
	public void quitarEntidad() {
		if (size > 0) {
			misEntidades[0] = misEntidades[1];
			misEntidades[1] = misEntidades[2];
			misEntidades[2] = null;
			size--;
		}

	}

	/*
	 * Establece el estado de la celda
	 * 
	 * @param e variable booleana que decide si la celda estara ocupada o no
	 */
	public void setEstado(boolean e) {
		ocupado = e;

	}

}
