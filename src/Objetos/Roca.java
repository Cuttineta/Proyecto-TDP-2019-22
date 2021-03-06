package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Roca extends ObjetoVida {

	public Roca() {

		vida = 35;

		estatico = new ImageIcon("Sprites/Objetos/roca.png");

		grafico = new JLabel();
		grafico.setIcon(estatico);

	}

	@Override

	public void setVida(int i) {
		this.vida = i;
		if (vida <= 0) {
			eliminarDeLaLista();
			this.grafico.setVisible(false);
		}
	}

}
