package Entidad;

import Mapa.Celda;

public class DrStrange extends Aliado {

	private static final int ALCANCE_DRS = 1, IMPACTO_DRS = 20;

	public DrStrange(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE_DRS;
		impacto = IMPACTO_DRS;
	}
}
