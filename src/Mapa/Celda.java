package Mapa;

import javax.swing.JLabel;

import Entidad.Entidad;

public class Celda {
	protected int fila;
	protected int columna;
	protected JLabel grafico;
	protected Entidad[] misEntidades;

	public Celda(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		misEntidades = new Entidad[5];
	}

}
