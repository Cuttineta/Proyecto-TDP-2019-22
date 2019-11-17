package Hilos;

import java.util.Iterator;

import Disparo.Disparo;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Mapa.mapa;

public class HiloControl extends Thread {

	protected mapa mapa;

	public HiloControl(mapa mapa) {
		this.mapa = mapa;
	}

	public void run() {

		while (true) {

			try {

				for (Aliado aliado : mapa.getAliados()) {
					Iterator itEnemigos = mapa.getEnemigos().iterator();
					Enemigo enemigo;
					boolean encontreColision = false;
					while (itEnemigos.hasNext() && encontreColision == false) {
						enemigo = (Enemigo) itEnemigos.next();
						if (aliado.getPosicionY() == enemigo.getPosicionY()
								&& enemigo.getPosicionX() - aliado.getPosicionX() <= aliado.getRango() + 50
								&& enemigo.getPosicionX() - aliado.getPosicionX() >= 10) {
							aliado.atacar(enemigo);
							encontreColision = true;
						}

					}
				}

				for (Enemigo enemigo : mapa.getEnemigos()) {
					Iterator itAliados = mapa.getAliados().iterator();
					Aliado aliado;
					boolean encontreColision = false;
					while (itAliados.hasNext() && encontreColision == false) {
						aliado = (Aliado) itAliados.next();
						if(aliado.getPosicionY()==enemigo.getPosicionY() &&
								enemigo.getPosicionX() - aliado.getPosicionX() <= 50 &&
								enemigo.getPosicionX() - aliado.getPosicionX() >= 10) {
							enemigo.atacar(aliado);
							encontreColision = true;
						}

					}

				}

				for (Enemigo enemigo : mapa.getEnemigos()) {
					for (Disparo disparo : mapa.getDisparos()) {
						if (disparo.getPosicionY() == enemigo.getPosicionY()
								&& enemigo.getPosicionX() - disparo.getPosicionX() <= 20
								&& enemigo.getPosicionX() - disparo.getPosicionX() >= 10) {
							enemigo.aceptarDisparo(disparo);
							disparo.eliminarDisparo();
							disparo.eliminarDeLaLista();

						}
					}
				}

				sleep(30);
			} catch (InterruptedException e) {

			}
		}
	}

}
