package Mapa;

import java.util.LinkedList;

import Enemigo.Enemigo;
import Entidad.*;

public class Juego {

	protected int puntos, monedas;
	protected Mapa mapa;
	protected GUI gui;
	protected LinkedList<Enemigo> enemigos;
	protected boolean terminar;

	public Juego(GUI graf) {
		puntos = 0;
		monedas = 200;
		mapa = new Mapa(this);
		gui = graf;

	}

	public int getMonedas() {
		return monedas;
	}

	public int getPuntos() {
		return puntos;
	}

	public void agregar(Entidad e) {

	}

	public void incrementarMonedas(int m) {
		monedas += m;
	}

	public void decrementarMonedas(int m) {
		monedas -= m;
		if (monedas < 0)
			monedas = 0;
	}

	public void incrementarPuntaje(int p) {
		puntos += p;
	}

}
