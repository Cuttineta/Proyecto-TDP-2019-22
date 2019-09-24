package Enemigo;

import Entidad.Personaje;
import Mapa.Celda;

public abstract class Enemigo extends Personaje {

	protected int puntos, monedas, velocidad;
	protected boolean atacando;

	public Enemigo(Celda c) {
		super(c);
	}

	public abstract int getPuntos();

	public abstract int getMonedas();

	public abstract int getVelocidad();

	public abstract boolean atacando();
}
