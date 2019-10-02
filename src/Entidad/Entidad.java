package Entidad;

import java.awt.Point;

import javax.swing.JLabel;

public abstract class Entidad {

	protected JLabel img;
	protected Point pos;

	/*
	 * Crea una nueva entidad ubicada en la pos
	 * 
	 * @param p point en donde va a estar posicionada la entidad
	 */
	public Entidad(Point p) {
		pos = p;
		img = new JLabel();

	}

	/*
	 * Devuelve el Point en la que esta situada la entidad
	 */

	public Point getPos() {
		return pos;
	}
	
	/*
	 * Devuelve la fila en la que esta situada la entidad
	 */
	public double getFila() {
		return pos.getY();
	}
	
	
	/*
	 * Devuelve la columna en la que esta situada la entidad
	 */
	public double getColumna() {
		return pos.getX();
	}

	/*
	 * Retorna el JLabel de la entidad
	 */
	public JLabel getImage() {
		return img;
	}

	/*
	 * TODO corregir la destrucción
	 * Destruye la entidad
	 */
	public void destruir() {
		if (img != null) {
			img.setIcon(null);
			img = null;
		}
		if (pos != null) {

		}
	}
}
