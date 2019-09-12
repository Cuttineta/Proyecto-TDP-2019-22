package Entidad;

import Mapa.Celda;

public abstract class Personaje extends Entidad {
	protected int vida, impacto, alcance, valor;

	public Personaje(Celda c) {
		super(c);
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

}
