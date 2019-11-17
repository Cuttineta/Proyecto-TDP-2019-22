package Disparo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisparoHulk extends Disparo {

	public DisparoHulk(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		estatico = new ImageIcon("");
		grafico = new JLabel();
	}
}