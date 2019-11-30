package Disparo.DisparoEnemigo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;

public class DisparoSentryUltron extends DisparoEnemigo {
	
	public DisparoSentryUltron(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		grafico = new JLabel();
	}

}
