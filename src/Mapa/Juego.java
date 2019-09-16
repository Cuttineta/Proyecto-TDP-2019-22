package Mapa;

import Entidad.*;

public class Juego {

	protected int puntos;
	protected Mapa mapa;
	protected int monedas;
	protected GUI gui;

	public Juego() {
		puntos = 0;
		mapa = new Mapa(this);
		gui = new GUI();

	}

}
