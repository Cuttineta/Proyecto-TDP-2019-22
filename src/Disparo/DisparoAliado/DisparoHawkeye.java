package Disparo.DisparoAliado;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import GUI.Ventana;

public class DisparoHawkeye extends DisparoAliado {

	public DisparoHawkeye(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		estatico = new ImageIcon("Sprites/Aliados/Hawkeye/flechazo.png");
		grafico = new JLabel();
		Ventana.getFondo().add(grafico);
		grafico.setIcon(estatico);
	}
	
}