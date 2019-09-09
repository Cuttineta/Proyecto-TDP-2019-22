package Mapa;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mapa {

	private Celda[][] matriz;
	private static final Image imgClara = new ImageIcon("imágenes\\Sprites\\Celda_Asfalto_claro.png").getImage();
	private static final Image imgOscura = new ImageIcon("imágenes\\Sprites\\Celda_Asfalto_Oscuro.png").getImage();

	public Mapa() {
		matriz = new Celda[6][10];
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; i < matriz[0].length; j++) {
				if (i + j / 2 != 0) {
					matriz[i][j] = new Celda(imgClara);
				} else
					matriz[i][j] = new Celda(imgOscura);

			}

	}
}
