package Logica.Juego;

import GUI.Paneles.PanelJuego;
import Logica.Entidades.Enemigos.Enemigo;
import Logica.Hilos.Control;
import Logica.Hilos.HiloMovimientoEnemigo;
import Logica.Mapa.Mapa;
import Logica.Mapa.Niveles.Horda;
import Logica.Mapa.Niveles.Nivel;
import Logica.Mapa.Niveles.Nivel1;
import Logica.Tienda.Tienda;

public class Juego {
	private PanelJuego Gui;
	// private int tiempo;
	private Tienda tienda;
	private Nivel nivel;
	private Mapa mapa;
	private HiloMovimientoEnemigo hiloEnem;
	private Control controlador;

	/**
	 * Se inicializa el juego en el Nivel 1
	 * 
	 * @param g
	 */
	public Juego(PanelJuego g) {
		Gui = g;
		tienda = new Tienda(this);
		mapa = new Mapa(this);
		nivel = new Nivel1(this);
		//Horda horda = new Horda(mapa);
		// tiempo=0;

	}

	/**
	 * public void aumentarTiempo() { tiempo++;
	 * Gui.getPanelStats().actualizarTiempo(); }
	 **/

	public void iniciar() {
		hiloEnem = new HiloMovimientoEnemigo();// Crea el hilo
		hiloEnem.agregarEnemigo((Enemigo) Gui.getPanelMapa().getEntidadMapa()); // Agrega la entidad al hilo
		hiloEnem.start();// Inicia el hilo del movimiento de enemigos

		controlador = new Control(mapa.getColeccion());
		controlador.start();
	}

	public void reanudar() {
		// TODO Auto-generated method stub

	}

	public Tienda getTienda() {
		return tienda;
	}

	public PanelJuego getPanelJuego() {
		return Gui;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public Mapa getMapa() {
		return mapa;
	}

}