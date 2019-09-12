package Entidad;

import Mapa.Celda;

public class DrStrange extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;

	public DrStrange(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
	}
}
