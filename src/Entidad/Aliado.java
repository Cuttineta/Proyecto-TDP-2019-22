package Entidad;

import Mapa.Celda;

public abstract class Aliado extends Personaje {

	protected static final int MAX_VIDA = 100;
	protected boolean esperando;

	public Aliado(Celda c) {
		super(c);
		vida = MAX_VIDA;
		esperando = true;
	}

	public abstract boolean enEspera();
}
