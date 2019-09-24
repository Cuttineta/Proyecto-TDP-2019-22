package Enemigo;

import Entidad.Personaje;
import Mapa.Celda;

public abstract class Enemigo extends Personaje {

	private int puntos, monedas, velocidad;
	private boolean atacando;

	public Enemigo(Celda c) {
		super(c);
	}

	public abstract int getPuntos();

	public abstract int getMonedas();

	public abstract int getVelocidad();

	public abstract boolean atacando();
}
