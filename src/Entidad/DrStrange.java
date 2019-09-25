package Entidad;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Celda;

public class DrStrange extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;

	private ImageIcon i = new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Dr Strange/tienda.png"));

	public DrStrange(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
		img.setIcon(i);

	}

	@Override
	public int getVida() {
		return vida;
	}

	@Override
	public int getImpacto() {

		return impacto;
	}

	@Override
	public int getAlcance() {

		return alcance;
	}

	@Override
	public int getValor() {

		return valor;
	}

	@Override
	public boolean enEspera() {
		return esperando;
	}
}
