package Disparo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.Ventana;

public class DisparoIronman extends Disparo {

	public DisparoIronman(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		estatico = new ImageIcon("Sprites/Aliados/Ironman/disparo.png");
		grafico = new JLabel();
		Ventana.getFondo().add(grafico);
		grafico.setIcon(estatico);
	}
}
