package Hilos;

import Disparo.Disparo;
import Entidad.Aliados.Aliado;
import Juego.Juego;
import Objetos.Objeto;
import PowerUp.PowerUp;

public class HiloMovimiento extends Thread {

	private Juego juego;
	private boolean run;

	public HiloMovimiento(Juego g) {
		run = true;
		juego = g;
		juego.getNivel();
		juego.getVentana();
	}

	public void frenarHiloMovimiento() {
		run = false;
	}

	public void run() {
		run = true;
		while (run) {
			try {

				for (Aliado aliado : juego.getMapa().getAliados()) {

					aliado.actuar();
				}

				for (Disparo disparo : juego.getMapa().getDisparos()) {
					disparo.actuar();
				}

				for (Objeto objeto : juego.getMapa().getObjetos()) {
					objeto.actuar();
				}

				for (PowerUp power : juego.getMapa().getPowerUps()) {

					power.actuar();
				}

				sleep(60);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
