package Enemigo;


public class Nebula extends Enemigo {

	private static final int ALCANCE = 1, IMPACTO = 20;

	public Nebula(int x, int y) {
		super(x,y);
		alcance = ALCANCE;
		impacto = IMPACTO;
		atacando = false;
		puntos = 100;
		monedas = 75;
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

}