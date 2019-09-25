package Entidad;

import Mapa.Celda;

public abstract class Aliado extends Personaje {

	protected boolean esperando;

	public Aliado(Celda c) {
		super(c);
		vida = MAX_VIDA;
		esperando = true;
	}

	/*
	 * Retorna el estado del personaje. Si esta en espera, no atacara. Caso
	 * contrario, comenzara a disparar
	 */
	public abstract boolean enEspera();

}
