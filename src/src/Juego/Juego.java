package Juego;

import Tienda.tienda;

import javax.swing.JLabel;

import GUI.Ventana;
import Hilos.HiloControl;
import Hilos.HiloMovimiento;
import Mapa.mapa;
import Niveles.*;

public class Juego {
	protected static Juego miJuego;
	protected mapa mapa;
	protected tienda tienda;
	protected Nivel nivel;
	protected int puntosPartida;
	private HiloMovimiento hiloHordas;
	protected Ventana ventana;
	protected HiloMovimiento hiloHorda;
	protected HiloControl control;
	
	public static Juego getJuego(Ventana v) {
		if(miJuego == null) {
			miJuego = new Juego(v);
		}
		return miJuego;
	}
	private Juego(Ventana vent) {
		puntosPartida = 0;
		ventana = vent;
		nivel = new Nivel1(this);
		tienda = tienda.getTienda(this);
		mapa = mapa.getMapa();
		mapa.setJuego(this);
		hiloHorda = new HiloMovimiento(this);
		control = new HiloControl(this);
		
	}
	
	public Nivel getNivel() {
		return nivel;
	}
	
	public void iniciarHilos() {
		hiloHorda.start();
		control.start();
	}
	
	public void sumarMonedasTienda(int i) {
		tienda.sumarMonedas(i);
		actualizarMonedas();
	}
	
	public void sumarPuntosPartida(int p) {
		puntosPartida += p;
	}
	
	
	public void actualizarMonedas() {
		ventana.actualizarMonedas();
	}
	
	public mapa getMapa() {
		return mapa;
	}
	
	public int getPuntosPartida() {
		return puntosPartida;
	}
	
	
	public void siguienteNivel() {
		nivel.siguienteNivel();
		tienda.reiniciarMonedas();
		hiloHorda.frenarHiloMovimiento();
		control.frenarHiloControl();
		mapa.vaciarMapa();
		hiloHorda = new HiloMovimiento(this);
		control = new HiloControl(this);
		
		iniciarHilos();
	}
	
	public void setNivel(Nivel n) {
		nivel = n;
	}
	
	public tienda getTienda() {
		return tienda;
	}


	public Ventana getVentana() {
		return ventana;
	}
	

	public void agregarEnemigoAMapa(JLabel grafico) {
		ventana.getFondo().add(grafico);
		
	}

	public void victoria() {
		ventana.mostrarGano(puntosPartida);
		
	}
	public void crearPowerMuerte(int x, int y) {
		ventana.CrearBotonMuerte(x,y);
		
	}
	public void crearPowerProteccion(int x, int y) {
		ventana.CrearBotonProteccion(x,y);
		
	}
}
