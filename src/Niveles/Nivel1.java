package Niveles;

import Juego.Juego;

public class Nivel1 extends Nivel {
	
	public Nivel1(Juego j) {
		super(j);
		cantEnemigos = 15;
	}
	
	public int getCantEnemigos() {
		return cantEnemigos;
	}

	@Override
	public void siguienteNivel(Juego j) {
		j.setNivel(new Nivel2(juego));
	}

	
}
