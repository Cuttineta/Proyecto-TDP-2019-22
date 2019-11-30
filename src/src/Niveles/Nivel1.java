package Niveles;

import Juego.Juego;

public class Nivel1 extends Nivel {
	private int oleada1, oleada2, oleada3;

	public Nivel1(Juego j) {
		super(j);
		oleada1 = 4;
		oleada2 = 8;
		oleada3 = 10;
		cantEnemigos = oleada1;
	}

	public int getCantEnemigos() {
		return cantEnemigos;
	}

	public void sigOleada() {
		if (cantEnemigos == oleada1) {
			
			cantEnemigos = oleada2;
		} else {
			if (cantEnemigos == oleada2) {

				cantEnemigos = oleada3;
			}
		}

	}

	public int getUltimaOleada() {
		return oleada3;
	}

	@Override
	public void siguienteNivel() {
		juego.setNivel(new Nivel2(juego));
	}

	@Override
	public boolean ultimaOleada() {
		return cantEnemigos == oleada3;
	}

}
