package Disparo;

import javax.swing.JLabel;

public class DisparoUltron extends Disparo {
	
	public DisparoUltron(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		grafico = new JLabel();
	}

}
