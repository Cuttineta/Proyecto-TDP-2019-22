package Mapa;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

import Disparo.Disparo;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Juego.Juego;

public class mapa {
	
	protected ConcurrentLinkedDeque<Aliado> aliados;
	protected ConcurrentLinkedDeque<Enemigo> enemigos;
	protected ConcurrentLinkedDeque<Disparo> disparos;
	private static mapa miMapa;
	protected Juego juego;
	
	public static mapa getMapa() {
		if(miMapa == null) {
			miMapa = new mapa();
		}
		return miMapa;
	}
	
	private mapa() {
		aliados = new ConcurrentLinkedDeque<Aliado>();
		enemigos = new ConcurrentLinkedDeque<Enemigo>();
		disparos = new ConcurrentLinkedDeque<Disparo>();	
	}
	
	public boolean hayEnPos(int x, int y ) {
		Iterator<Aliado> it = aliados.iterator();
		boolean encontre = false;
		Aliado actual;
		while(it.hasNext() && !encontre) {
			actual = it.next();
			if((actual.getPosicionX()==x)&&(actual.getPosicionY()==y))
				encontre = true;
		}
		return encontre;
	}
	
	public void agregarAliado(Aliado aliado) {
		aliados.add(aliado);
	}
	
	public void eliminarAliado(Aliado aliado) {
		aliados.remove(aliado);
	}
	
	public void agregarEnemigo(Enemigo enemigo) {
		enemigos.add(enemigo);
	}
	
	public void eliminarEnemigo(Enemigo enemigo) {
		juego.sumarMonedasTienda(enemigo.getRecompensa());
		enemigos.remove(enemigo);
	}
	
	public void agregarDisparo(Disparo disparo) {
		disparos.add(disparo);
	}
	
	public void eliminarDisparo(Disparo disparo) {
		disparos.remove(disparo);
	}
	
	public ConcurrentLinkedDeque<Enemigo> getEnemigos(){
		return enemigos;
	}
	
	public ConcurrentLinkedDeque<Aliado> getAliados(){
		return aliados;
	}
	
	public ConcurrentLinkedDeque<Disparo> getDisparos(){
		return disparos;
	}

	public void vaciarMapa() {
		for(Aliado a: aliados) {
			a.getEstado().cambiarAMuerto();
		}
		for(Disparo d:disparos) {
			d.eliminarDisparo();
		}
	}
	
	public void setJuego(Juego j) {
		juego =j;
	}
}
