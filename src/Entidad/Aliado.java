package Entidad;

import Mapa.Celda;

public abstract class Aliado extends Personaje {

	protected static final int MAX_VIDA = 100;

	public Aliado(Celda c) {
		super(c);
		vida = MAX_VIDA;
	}

}
