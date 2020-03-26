package Disparo.DisparoAliado;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.Ventana;

public class DisparoDrStrange extends DisparoAliado {

	public DisparoDrStrange(int danio, int rango, int x, int y) {
		super(danio, rango, x, y);
		estatico = new ImageIcon("Sprites/Aliados/Dr Strange/disparo.png");
		grafico = new JLabel();
		Ventana.getFondo().add(grafico);
		grafico.setIcon(estatico);
	}

}