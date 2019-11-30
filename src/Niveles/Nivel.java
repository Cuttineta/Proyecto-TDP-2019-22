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
import PowerUp.CampoDeMuerte;
import PowerUp.CampoDeProteccion;

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
		crearEnemigoRandom(nro, ejeY);

	}

	private void crearEnemigoRandom(int n, int y) {
		Enemigo enemigo = null;
		CampoDeMuerte campo = new CampoDeMuerte();
		CampoDeProteccion campoP = new CampoDeProteccion();
		switch (n) {
		case (0):
			enemigo = new Thanos();
			break;
		case (1):
			enemigo = new Nebula();
			break;
		case (2):
			enemigo = new SentryUltron();
			break;
		case (3):
			enemigo = new Ultron();
			break;
		case (4):
			enemigo = new Surtur();
			break;
		case (5):
			enemigo = new Yondu();
			break;
		}
		Random rnd = new Random();
		int nmroAleatorio = rnd.nextInt(8);
		if (nmroAleatorio == 0) {
			campo.setPersonaje(enemigo);
			campo.agregarALaLista();
			juego.agregarEnemigoAMapa(campo.getGrafico());
		}

		if (nmroAleatorio == 2) {
			campoP.setPersonaje(enemigo);
			campoP.agregarALaLista();
			juego.agregarEnemigoAMapa(campoP.getGrafico());
		}
		enemigo.setPosicionX(1230);
		enemigo.setPosicionY(y);

		juego.agregarEnemigoAMapa(enemigo.getGrafico());
		juego.getMapa().agregar(enemigo);
	}

	public abstract int getCantEnemigos();

	public abstract void sigOleada();

	public abstract boolean ultimaOleada();

	public abstract void siguienteNivel();
}
