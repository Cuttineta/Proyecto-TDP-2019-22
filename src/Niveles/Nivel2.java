package Niveles;

import Juego.Juego;

public class Nivel2 extends Nivel {
	
	public Nivel2(Juego j) {
		super(j);
		cantEnemigos = 25;
	}
	
	public int getCantEnemigos() {
		return cantEnemigos;
	}

	@Override
	public void siguienteNivel(Juego j) {
	}


}
