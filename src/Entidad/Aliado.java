package Entidad;

import Mapa.Celda;

public abstract class Aliado extends Personaje {

	public Aliado(Celda c) {
		super(c);
	}

	protected static final int MAX_VIDA = 100;
	protected int vida, alcance, impacto, valor;

	public int getVida() {
		return vida;
	}

	public int getAlcance() {
		return alcance;
	}

	public int getImpacto() {
		return impacto;
	}

	public int getValor() {
		return valor;
	}
}
