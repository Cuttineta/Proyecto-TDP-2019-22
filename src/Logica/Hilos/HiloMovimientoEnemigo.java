package Logica.Hilos;

import java.util.ArrayList;
import java.util.List;

import Logica.Entidades.Enemigos.Enemigo;

public class HiloMovimientoEnemigo extends Thread {
	protected volatile List<Enemigo> toInsert, toExecute;
	protected volatile boolean ejecutar;

	public HiloMovimientoEnemigo() {
		ejecutar = true;
		toExecute = new ArrayList<Enemigo>();
		toInsert = new ArrayList<Enemigo>();
	}

	public void agregarEnemigo(Enemigo e) {
		toExecute.add(e);
	}

	public void run() {
		Enemigo enemigo = toExecute.get(0);
		int y = enemigo.getPos().getPunto().y;
		for (int i = 1200; i > 0; i = i - 3) {
			enemigo.getGrafico().cambiarPos(i, y);
			try {
				sleep(65);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
