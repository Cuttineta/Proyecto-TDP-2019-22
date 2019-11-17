package Disparo;

import javax.swing.JLabel;

public class DisparoSurtur extends Disparo {
	
	public DisparoSurtur(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		grafico = new JLabel();
	}

}
