package Mapa;

import javax.swing.JLabel;
import Entidad.Entidad;

public class Celda {
	protected int fila;
	protected int columna;
	protected JLabel grafico;
	protected Entidad[] misEntidades;
	protected Mapa miMapa;

	public Celda(int fila, int columna, Mapa m) {
		miMapa = m;
		this.fila = fila;
		this.columna = columna;
		misEntidades = new Entidad[3];
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

}
