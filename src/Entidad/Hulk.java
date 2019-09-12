package Entidad;

import Mapa.Celda;

public class Hulk extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;

	public Hulk(Celda c) {
		super(c);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
	}
}