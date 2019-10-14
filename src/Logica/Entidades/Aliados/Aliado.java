package Logica.Entidades.Aliados;

import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public abstract class Aliado extends Personaje {
	protected int cost;
	// protected IntelDef

	public Aliado(int x, int y, Mapa m) {
		super(x, y, m);
	}

	public int getCost() {
		return cost;
	}
}
