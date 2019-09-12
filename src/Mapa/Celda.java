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

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public JLabel getGrafico() {
		return grafico;
	}

	public void setGrafico(JLabel grafico) {
		this.grafico = grafico;
	}

	public Entidad[] getMisEntidades() {
		return misEntidades;
	}

	public void setMisEntidades(Entidad[] misEntidades) {
		this.misEntidades = misEntidades;
	}

}
