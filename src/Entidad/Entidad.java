package Entidad;

import Mapa.Celda;

public abstract class Entidad {

	protected Celda miCelda;

	public Entidad(Celda c) {
		miCelda = c;
	}

	public Celda getCelda() {
		return miCelda;
	}

}
