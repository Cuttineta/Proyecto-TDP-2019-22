package Enemigo;

import Mapa.Celda;

public class Thanos extends Enemigo {

	private static final int ALCANCE = 1, IMPACTO = 20;

	public Thanos(Celda c) {
		super(c);
		alcance = ALCANCE;
		impacto = IMPACTO;
		atacando = false;
		puntos = 150;
		monedas = 100;
	}

	@Override
	public int getPuntos() {
		return puntos;
	}

	@Override
	public int getMonedas() {
		return monedas;
	}

	@Override
	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public boolean atacando() {
		return atacando;
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

}
