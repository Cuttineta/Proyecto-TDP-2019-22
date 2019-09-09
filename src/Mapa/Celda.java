package Mapa;

import java.awt.Image;

public class Celda {
	private Image fondo;

	public Celda(Image f) {
		fondo = f;
	}

	public Image getImage() {
		return fondo;
	}

}
