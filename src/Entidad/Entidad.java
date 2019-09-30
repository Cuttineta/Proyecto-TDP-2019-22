package Entidad;

import javax.swing.JLabel;

import Game.Celda;

public abstract class Entidad {

	protected JLabel img;
	protected Celda miCelda;

	/*
	 * Crea una nueva entidad ubicada en la celda c
	 * 
	 * @param c celda en la que va a estar posicionada la entidad
	 */
	public Entidad(Celda c) {
		miCelda = c;
		img = new JLabel();

	}

	/*
	 * Devuelve la celda en la que esta situada la entidad
	 */

	public Celda getCelda() {
		return miCelda;
	}

	/*
	 * Retorna el JLabel de la entidad
	 */
	public JLabel getImage() {
		return img;
	}

	/*
	 * 
	 */
	public void destruir() {
		if (img != null) {
			img.setIcon(null);
			img = null;
		}
		if (miCelda != null) {

		}
	}
}
