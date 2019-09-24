package Entidad;

import Mapa.Celda;

public class Thor extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;

	public Thor(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
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