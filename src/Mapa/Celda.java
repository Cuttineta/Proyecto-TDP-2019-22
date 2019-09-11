package Mapa;

import javax.swing.JLabel;

import Entidad.Entidad;

public class Celda {
	protected int fila;
	protected int columna;
	protected JLabel grafico;
	protected Entidad[] misEntidades;
	protected Mapa mapa;

	public Celda(int fila, int columna, Mapa m) {
		this.fila = fila;
		this.columna = columna;
		mapa = m;
		misEntidades = new Entidad[5];

		for (Entidad c : misEntidades) {
			c = null;
		}
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public boolean ocupado(int p) {
		return !(misEntidades[p] == null);
	}

	public Celda getIzquierda() {
		Celda toRet = null;
		if (columna - 1 >= 0)
			toRet = mapa.getCelda(fila, columna - 1);
		return toRet;
	}

	/*
	 * public Celda getDerecha() { Celda toRet = null; if (this.columna + 1 <
	 * this.mapa.getJuego().getColumnas()) toRet = this.mapa.getCelda(this.fila,
	 * this.columna + 1); return toRet; }
	 */

	public void quitar(int p) {
		misEntidades[p] = null;
	}
	
	public void agregar(Entidad e) {
		//misEntidades[c]
		
	}
}
