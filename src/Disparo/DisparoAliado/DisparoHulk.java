package Disparo.DisparoAliado;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisparoHulk extends DisparoAliado {

	public DisparoHulk(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		estatico = new ImageIcon("");
		grafico = new JLabel();
	}
}