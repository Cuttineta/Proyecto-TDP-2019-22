package Hilos;

import java.util.Random;

import Entidad.Enemigos.Enemigo;
import GUI.Ventana;
import Juego.Juego;
import Mapa.mapa;
import Niveles.Nivel;
import Objetos.Charco;
import Objetos.Roca;

public class HiloControl extends Thread {
	private boolean run;

	protected mapa mapa;
	protected Juego juego;
	protected Nivel nivel;
	protected Ventana ventana;

	public HiloControl(Juego juego) {
		run = true;
		this.juego = juego;
		nivel = juego.getNivel();
		ventana = juego.getVentana();
		this.mapa = juego.getMapa();
	}

	public void frenarHiloControl() {
		run = false;
	}

	public void run() {
		run = true;
		int vueltas = 0, vueltas2 = 0, i = 0;

		while (run) {

			try {
				vueltas2++;
				if (vueltas2 % 80 == 0 && i < nivel.getCantEnemigos()) {
					nivel.crearHorda();
					i++;
					vueltas2 = 1;
				}
				if (i >= nivel.getCantEnemigos()) {

					if (juego.getMapa().getEnemigos().isEmpty() && !nivel.ultimaOleada()) {

						nivel.sigOleada();
						i = 0;

					} else {
						if (juego.getMapa().getEnemigos().isEmpty() && nivel.ultimaOleada()) {

							juego.siguienteNivel();
							ventana.mostrarCambioDeNivel();
						}
					}

				}

				for (Enemigo enemigo : juego.getMapa().getEnemigos()) {
					enemigo.actuar();
					if (enemigo.getPosicionX() <= 0) {
						ventana.mostrarPerdio(juego.getPuntosPartida());
					}
				}

				Random rnd = new Random();
				int nro = rnd.nextInt(8);
				int ejeY = rnd.nextInt(6) * 116 + 35;
				int ejeX = rnd.nextInt(9) * 116 + 35;

				if (vueltas % 100 == 0) {

					if (nro == 0) {

						Roca nuevaRoca = new Roca();
						mapa.agregar(nuevaRoca);
						nuevaRoca.getGrafico().setBounds(0, 0, 100, 100);
						while (mapa.hayEnPos(ejeX, ejeY)) {
							ejeY = rnd.nextInt(6) * 116 + 35;
							ejeX = rnd.nextInt(9) * 116 + 35;

						}
						nuevaRoca.setPosicionX(ejeX);
						nuevaRoca.setPosicionY(ejeY);

						juego.getVentana();
						Ventana.getFondo().add(nuevaRoca.getGrafico());
						juego.getVentana().repaint();

					}

					if (nro == 1) {

						Charco nuevoCharco = new Charco();
						mapa.agregar(nuevoCharco);
						nuevoCharco.getGrafico().setBounds(0, 0, 100, 100);
						while (mapa.hayEnPos(ejeX, ejeY)) {
							ejeY = rnd.nextInt(6) * 116 + 35;
							ejeX = rnd.nextInt(9) * 116 + 35;

						}
						nuevoCharco.setPosicionX(ejeX);
						nuevoCharco.setPosicionY(ejeY);

						juego.getVentana();
						Ventana.getFondo().add(nuevoCharco.getGrafico());
						juego.getVentana().repaint();

					}
					vueltas = 0;
				}

				vueltas++;
				sleep(60);
			} catch (InterruptedException e) {

			}
		}
	}

}
