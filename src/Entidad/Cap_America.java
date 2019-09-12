package Entidad;

import Mapa.Celda;

public class Cap_America extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;

	public Cap_America(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
	}
}
