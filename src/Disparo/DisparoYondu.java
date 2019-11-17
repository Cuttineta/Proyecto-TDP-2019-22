package Disparo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisparoYondu extends Disparo {
	
	public DisparoYondu(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		estatico = new ImageIcon("");
		grafico = new JLabel();
	}

}
