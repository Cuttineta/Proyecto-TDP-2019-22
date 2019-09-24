package Entidad;

import javax.swing.ImageIcon;

import Mapa.Celda;

public abstract class Personaje extends Entidad {

	protected static final int MAX_VIDA = 100;
	protected int vida, impacto, alcance, valor;

	public Personaje(Celda c) {
		super(c);
	}

	public abstract int getVida();

	public abstract int getImpacto();

	public abstract int getAlcance();

	public abstract int getValor();
}
