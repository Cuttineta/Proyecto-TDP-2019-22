package Mapa;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

import Disparo.Disparo;
import Entidad.Entidad;
import Entidad.Personaje;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Juego.Juego;
import Objetos.Objeto;
import PowerUp.PowerUp;

public class mapa {

	protected ConcurrentLinkedDeque<Aliado> aliados;
	protected ConcurrentLinkedDeque<Enemigo> enemigos;
	protected ConcurrentLinkedDeque<Disparo> disparos;
	protected ConcurrentLinkedDeque<Objeto> objetos;
	protected ConcurrentLinkedDeque<PowerUp> powerups;
	private static mapa miMapa;
	protected Juego juego;

	public static mapa getMapa() {
		if (miMapa == null) {
			miMapa = new mapa();
		}
		return miMapa;
	}

	private mapa() {
		aliados = new ConcurrentLinkedDeque<Aliado>();
		enemigos = new ConcurrentLinkedDeque<Enemigo>();
		disparos = new ConcurrentLinkedDeque<Disparo>();
		objetos = new ConcurrentLinkedDeque<Objeto>();
		powerups = new ConcurrentLinkedDeque<PowerUp>();
	}

	public boolean hayEnPos(int x, int y, Entidad a) {
		Iterator<Aliado> it = aliados.iterator();
		boolean encontre = false;
		Aliado actual;
		while (it.hasNext() && !encontre) {
			actual = it.next();
			if ((actual.getPosicionX() == x) && (actual.getPosicionY() == y))
				encontre = true;
		}
		return encontre;
	}

	public boolean hayEnPos(int x, int y) {
		Iterator<Aliado> it = aliados.iterator();
		boolean encontre = false;
		Aliado actual;
		while (it.hasNext() && !encontre) {
			actual = it.next();
			if ((actual.getPosicionX() == x) && (actual.getPosicionY() == y))
				encontre = true;
		}
		return encontre;
	}

	public boolean hayEnPos(int x, int y, PowerUp a) {
		Iterator<PowerUp> it = powerups.iterator();
		boolean encontre = false;
		PowerUp actual;
		while (it.hasNext() && !encontre) {
			actual = it.next();
			if ((actual.getPosicionX() == x) && (actual.getPosicionY() == y))
				encontre = true;
		}
		return encontre && hayEnPos(x, y);
	}

	public void agregar(Aliado aliado) {
		aliados.add(aliado);
	}

	public void eliminar(Aliado aliado) {
		for (PowerUp power : powerups) {
			if (power.getPersonaje() == aliado) {
				power.getGrafico().setVisible(false);
				power.eliminarDeLaLista();
			}
		}
		aliados.remove(aliado);
	}

	public void agregar(Enemigo enemigo) {
		enemigos.add(enemigo);
	}

	public void agregar(Objeto objeto) {
		objetos.add(objeto);
	}

	public void eliminar(Objeto objeto) {
		objetos.remove(objeto);
	}

	public void eliminar(Enemigo enemigo) {

		for (PowerUp power : powerups) {
			if (power.getPersonaje() == enemigo) {
				power.getGrafico().setVisible(false);
				power.eliminarDeLaLista();
			}
		}

		enemigos.remove(enemigo);
	}

	public void agregar(Disparo disparo) {
		disparos.add(disparo);
	}

	public void agregar(PowerUp power) {
		powerups.add(power);
	}

	public void eliminar(PowerUp power) {
		powerups.remove(power);
	}

	public void eliminar(Disparo disparo) {
		disparos.remove(disparo);
	}

	public ConcurrentLinkedDeque<Enemigo> getEnemigos() {
		return enemigos;
	}

	public ConcurrentLinkedDeque<Aliado> getAliados() {
		return aliados;
	}

	public ConcurrentLinkedDeque<Disparo> getDisparos() {
		return disparos;
	}

	public ConcurrentLinkedDeque<Objeto> getObjetos() {
		return objetos;
	}

	public ConcurrentLinkedDeque<PowerUp> getPowerUps() {
		return powerups;
	}

	public void vaciarMapa() {
		for (Aliado a : aliados) {
			a.getEstado().cambiarAMuerto();
		}
		for (Disparo d : disparos) {
			d.eliminarDisparo();
		}

		for (Objeto a : objetos) {
			a.eliminarDeLaLista();
			a.getGrafico().setVisible(false);
		}
	}

	public void setJuego(Juego j) {
		juego = j;
	}

	public Personaje getPersonajeAliadoEnPos(int x, int y) {
		Iterator<Aliado> itA = aliados.iterator();
		boolean encontre = false;
		Personaje salida = null;
		Aliado actualA;
		while (itA.hasNext() && !encontre) {
			actualA = itA.next();
			if ((actualA.getPosicionX() == x) && (actualA.getPosicionY() == y))
				salida = actualA;
			encontre = true;
		}
		return salida;

	}

	public void agregar(Entidad aColocar) {
		System.out.println("agrego entidad");

	}
}
