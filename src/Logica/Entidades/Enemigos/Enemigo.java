package Logica.Entidades.Enemigos;

import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public abstract class Enemigo extends Personaje {
	protected boolean sepuedemover;
	protected int movementSpeed;

	public Enemigo(int x, int y, Mapa m) {
		super(x, y, m);
		sepuedemover = true;
	}

	public void mover() {
		int x = (int) miCelda.getPunto().getX();
		if ((x - 1 >= 0) && sepuedemover) {
			int aux = (x - 1) * miCelda.getAncho();
			grafico.cambiarPos(grafico.getPosGrafica().x - movementSpeed, grafico.getPosGrafica().y);

		}
	}

}
