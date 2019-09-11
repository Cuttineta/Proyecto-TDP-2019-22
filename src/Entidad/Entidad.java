package Entidad;

import javax.swing.JLabel;

import Mapa.Celda;

public abstract class Entidad {

	protected Celda miCelda;
	protected JLabel grafico;

	public Entidad(Celda c) {
		miCelda = c;
		grafico = new JLabel();
	}

	public Celda getCelda() {
		return miCelda;
	}

}
