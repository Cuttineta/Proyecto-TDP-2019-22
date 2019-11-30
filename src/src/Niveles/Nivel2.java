package Niveles;

import Juego.Juego;

public class Nivel2 extends Nivel {
	private int oleada1, oleada2, oleada3;

	public Nivel2(Juego j) {
		super(j);
		oleada1 = 5;
		oleada2 = 9;
		oleada3 = 12;
		cantEnemigos = oleada1;
	}

	public int getCantEnemigos() {
		return cantEnemigos;
	}

	@Override
	public void siguienteNivel() {
		juego.victoria();
	}

	@Override
	public void sigOleada() {
		if (cantEnemigos == oleada1) {
			cantEnemigos = oleada2;
		} else {
			if (cantEnemigos == oleada2) {
				cantEnemigos = oleada3;
			}
		}

	}

	@Override
	public boolean ultimaOleada() {
		return oleada3 == cantEnemigos;
	}

}
