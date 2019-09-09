package juego;

public class Cap_America extends Aliado {

	private static final int MAX_VIDA = 100;
	private int vida, alcance, impacto;

	public Cap_America(int a, int i) {
		vida = MAX_VIDA;
		alcance = a;
		impacto = i;
	}

	@Override
	public int getVida() {
		return vida;
	}

	@Override
	public int getAlcance() {

		return alcance;
	}

	@Override
	public int getImpacto() {

		return impacto;
	}

}
