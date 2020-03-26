package Disparo.DisparoEnemigo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisparoThanos extends DisparoEnemigo {

	public DisparoThanos(int danio, int rango, int x, int y) {
		super(danio, rango, x, y);
		estatico = new ImageIcon("");
		grafico = new JLabel();
	}
}