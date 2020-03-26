package Disparo.DisparoAliado;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisparoThor extends DisparoAliado {

	public DisparoThor(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		estatico = new ImageIcon("");
		grafico = new JLabel();
	}
}
