package Mapa;

import Entidad.*;

public class Juego {

	protected int puntos, monedas;
	protected Mapa mapa;
	protected GUI gui;

	public Juego(GUI graf) {
		puntos = 0;
		monedas = 100;
		mapa = new Mapa(this);
		gui = graf;

	}

	public int getMonedas() {
		return monedas;
	}

	public int getPuntos() {
		return puntos;

	}

}
