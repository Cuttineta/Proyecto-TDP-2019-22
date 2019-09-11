package Entidad;

import Mapa.Celda;

public class IronMan extends Aliado {

	private static final int ALCANCE_IM = 1, IMPACTO_IM = 20;

	public IronMan(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE_IM;
		impacto = IMPACTO_IM;
	}
}
