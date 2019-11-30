package Hilos;

import javax.swing.JOptionPane;

import Disparo.Disparo;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Estado.Atacando;
import Estado.Estado;
import GUI.Ventana;
import Juego.Juego;
import Mapa.mapa;
import Niveles.Nivel;
import Niveles.Nivel1;
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
