package Entidad;

import java.awt.Point;

import javax.swing.JLabel;

public abstract class Entidad {

	protected JLabel img;
	protected int fila;
	protected int col;

	/*
	 * Crea una nueva entidad ubicada en la pos
	 * 
	 * @param p point en donde va a estar posicionada la entidad
	 */
	public Entidad(int x,int y) {
		fila = x;
		col = y;
		
		img = new JLabel();

	}
	
	/*
	 * Devuelve la fila en la que esta situada la entidad
	 */
	public double getFila() {
		return fila;
	}
	
	
	/*
	 * Devuelve la columna en la que esta situada la entidad
	 */
	public double getColumna() {
		return col;
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
		/*if (pos != null) {

		}*/
	}
}
