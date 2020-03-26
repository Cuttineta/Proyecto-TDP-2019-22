package Disparo.DisparoEnemigo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisparoYondu extends DisparoEnemigo {
	
	public DisparoYondu(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		estatico = new ImageIcon("");
		grafico = new JLabel();
	}

}
