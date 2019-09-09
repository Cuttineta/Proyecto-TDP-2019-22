package Mapa;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel {

	private Image imagen = new ImageIcon("imágenes\\Sprites\\asfalto.png").getImage();

	public void paint(Graphics g) {
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

		setOpaque(false);
		super.paint(g);
	}
}
