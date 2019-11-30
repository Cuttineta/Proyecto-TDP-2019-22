package Disparo.DisparoAliado;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import GUI.Ventana;

public class DisparoIronman extends DisparoAliado {

	public DisparoIronman(int d, int rango, int x, int y) {
		super(d,rango,x,y);
		estatico = new ImageIcon("Sprites/Aliados/Ironman/disparo.png");
		grafico = new JLabel();
		Ventana.getFondo().add(grafico);
		grafico.setIcon(estatico);
	}
}
