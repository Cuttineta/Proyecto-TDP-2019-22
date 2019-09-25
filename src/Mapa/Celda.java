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
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	public JLabel getGrafico() {
		return grafico;
	}

	public Mapa getMiMapa() {
		return miMapa;
	}

	public void agregarEntidad(Entidad e) {
		if (!ocupado) {
			misEntidades[size] = e;
			size++;
		}
		if (size == misEntidades.length) {
			ocupado = true;
		}
	}

	/*
	 * Elimina la primer entidad que se agregó a la celda
	 */
	public void quitarEntidad() {
		if (size > 0) {
			misEntidades[0] = misEntidades[1];
			misEntidades[1] = misEntidades[2];
			misEntidades[2] = null;
			size--;
		}

	}

	public void setEstado(boolean e) {
		ocupado = e;

	}

}
