package Entidad;

import javax.swing.ImageIcon;

import Mapa.Celda;

public class IronMan extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;

	public IronMan(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
		img = new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/IronMan/estatico.png"));
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
