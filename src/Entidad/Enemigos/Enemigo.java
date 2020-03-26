package Entidad.Enemigos;

import java.util.Iterator;
import java.util.Random;

import Entidad.Personaje;
import Entidad.Aliados.Aliado;
import Juego.Juego;
import Mapa.mapa;
import Objetos.Objeto;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje {

	public Enemigo() {
		visitor = new VisitorEnemigo(this);
	}

	public void eliminarDeLaLista() {
		mapa.getMapa().eliminar(this);
	}

	public void agregarALaLista() {
		mapa.getMapa().agregar(this);
	}

	public void actuar() {
		Iterator<Aliado> itAliados = mapa.getMapa().getAliados().iterator();
		Aliado aliado;
		boolean encontreColision = false;
		while (itAliados.hasNext() && encontreColision == false) {
			aliado = (Aliado) itAliados.next();
			if (aliado.getPosicionY() == this.getPosicionY() && this.getPosicionX() - aliado.getPosicionX() <= 40
					&& this.getPosicionX() - aliado.getPosicionX() >= 15) {
				aliado.aceptarVisitor(this.getVisitor());
				encontreColision = true;
			}

		}
		Iterator<Objeto> itObjetos = mapa.getMapa().getObjetos().iterator();
		Objeto objeto;
		while (itObjetos.hasNext() && encontreColision == false) {
			objeto = (Objeto) itObjetos.next();
			if (objeto.getPosicionY() == this.getPosicionY() && this.getPosicionX() - objeto.getPosicionX() <= 40
					&& this.getPosicionX() - objeto.getPosicionX() >= 15) {

				objeto.aceptarVisitor(this.getVisitor());
				encontreColision = true;
			}

		}
		if (!encontreColision) {
			velocidad = velocidadInicial;
			estado.cambiarACaminando();
		}
		estado.mover();
	}

	public void aceptarVisitor(Visitor v) {
		v.visitar(this);
	}

	public void setVida(int vida) {
		this.vida = vida;
		if (vida <= 0) {
			Random rnd = new Random();
			int nro = rnd.nextInt(8);
			if (nro == 0) {
				Juego.getJuego(null).crearPowerProteccion(posicionX, posicionY);
			}
			if (nro == 1) {
				Juego.getJuego(null).crearPowerMuerte(posicionX, posicionY);
			}
			estado.cambiarAMuerto();
			estado.actuar();

		}
	}

}
