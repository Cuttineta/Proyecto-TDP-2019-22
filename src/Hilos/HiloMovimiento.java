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

public class HiloMovimiento extends Thread {

	private Juego juego;
	private HiloControl control;
	private Nivel nivel;
	private Ventana ventana;
	private boolean perder;

	public HiloMovimiento(Juego g,Ventana vent) {
		juego = g;
		nivel =  new Nivel1(g);
		control = new HiloControl(juego.getMapa());
		ventana = vent;
	}

	public void run() {
		int vueltas2 = 0;
		int vueltas = 0;
		int i = 0;
		while (true) {
			try {

				if (vueltas % 80 == 0 && i < nivel.getCantEnemigos()) {
					nivel.crearHorda();
					i++;
					vueltas = 0;
				}
				if(i>= nivel.getCantEnemigos()){
					if(mapa.getMapa().getEnemigos().isEmpty()) {
						ventana.mostrarGano();

					}
				}

				for (Enemigo enemigo : mapa.getMapa().getEnemigos()) {
					enemigo.mover();
					if(enemigo.getPosicionX() <= 0) {
						ventana.mostrarPerdio();
					}
				}
				if (vueltas2 % 80 == 0) {
					for (Aliado aliado : mapa.getMapa().getAliados()) {
						aliado.getEstado().cambiarACaminando();
					}
					vueltas2 = 0;
				}

				for (Disparo disparo : mapa.getMapa().getDisparos()) {
					disparo.mover();
				}

				vueltas++;
				vueltas2++;

				sleep(60);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
