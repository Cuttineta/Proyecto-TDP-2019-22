package Niveles;

import java.util.Random;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.Nebula;
import Entidad.Enemigos.SentryUltron;
import Entidad.Enemigos.Surtur;
import Entidad.Enemigos.Thanos;
import Entidad.Enemigos.Ultron;
import Entidad.Enemigos.Yondu;
import GUI.Ventana;
import Juego.Juego;

public abstract class Nivel {
	protected int cantEnemigos;
	protected Juego juego;
	
	public Nivel(Juego j) {
		juego = j;
	}
	
	public void crearHorda() {
		Random rnd = new Random();
		int nro = rnd.nextInt(6);
		 int ejeY = rnd.nextInt(6) * 116 + 35;
		crearEnemigoRandom(nro,ejeY);
		
	}
	
	private void crearEnemigoRandom(int n,int y) {
		Enemigo enemigo = null;
		switch(n){
			case(0):enemigo = new Thanos();
				break;
			case(1):enemigo = new Nebula();
				break;
			case(2):enemigo = new SentryUltron();
				break;
			case(3):enemigo = new Ultron();
				break;
			case(4):enemigo = new Surtur();
				break;
			case(5):enemigo = new Yondu();
				break;
		}
		enemigo.setPosicionX(1230);
		enemigo.setPosicionY(y);
		juego.agregarEnemigoAMapa(enemigo.getGrafico());
		juego.getMapa().agregarEnemigo(enemigo);
	}
	public abstract int getCantEnemigos();

	public abstract void siguienteNivel(Juego j);
}
