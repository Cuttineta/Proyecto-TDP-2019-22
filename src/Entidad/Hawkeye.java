package Entidad;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Celda;

public class Hawkeye extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;
	private ImageIcon i = new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hawkeye/estatico.png"));

	public Hawkeye(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
		img.setIcon(i);
	}

	public int getVida() {
		return vida;
	}

	public int getImpacto() {

		return impacto;
	}

	public int getAlcance() {

		return alcance;
	}

	public int getValor() {

		return valor;
	}

	public boolean enEspera() {
		return esperando;
	}

}
