package Juego;

import Tienda.tienda;

import javax.swing.JLabel;

import GUI.Ventana;
import Hilos.HiloControl;
import Hilos.HiloMovimiento;
import Mapa.mapa;
import Niveles.*;

public class Juego {
	
	protected mapa mapa;
	protected tienda tienda;
	protected Nivel nivel;
	private HiloMovimiento hiloHordas;
	protected Ventana ventana;
	protected HiloMovimiento hiloHorda;
	protected HiloControl control;
	
	public Juego(Ventana vent) {
		ventana = vent;
		nivel = new Nivel1(this);
		tienda = tienda.getTienda(this);
		mapa = mapa.getMapa();
		mapa.setJuego(this);
		hiloHorda = new HiloMovimiento(this,ventana);
		control = new HiloControl(mapa);
		
	}
	
	public void iniciarHilos() {
		hiloHorda.start();
		control.start();
	}
	
	public void sumarMonedasTienda(int i) {
		tienda.sumarMonedas(i);
		actualizarMonedas();
	}
	
	
	public void actualizarMonedas() {
		ventana.actualizarMonedas();
	}
	
	public mapa getMapa() {
		return mapa;
	}
	
	
	public void siguienteNivel() {
		nivel.siguienteNivel(this);
		mapa.vaciarMapa();
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
}
