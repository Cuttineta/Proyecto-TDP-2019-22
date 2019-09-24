package Entidad;

import javax.swing.JLabel;

import Mapa.Celda;

public abstract class Entidad {

	protected JLabel img;
	protected Celda miCelda;

	public Entidad(Celda c) {
		miCelda = c;
		img = new JLabel();

	}

	public Celda getCelda() {
		return miCelda;
	}

	public JLabel getImage() {
		return img;
	}

	public void destruir() {
		if (img != null) {
			img.setIcon(null);
			img = null;
		}
		if (miCelda != null) {

		}
	}
}
