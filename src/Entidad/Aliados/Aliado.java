package Entidad.Aliados;

import java.util.Iterator;

import Entidad.Personaje;
import Entidad.Enemigos.Enemigo;
import Mapa.mapa;
import Visitor.Visitor;
import Visitor.VisitorAliado;

public abstract class Aliado extends Personaje {

	protected int rango;

	public Aliado() {
		visitor = new VisitorAliado(this);
	}

	public int getVidaInicial() {
		return vidaInicial;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public void eliminarDeLaLista() {
		mapa.getMapa().eliminar(this);
	}

	public void agregarALaLista() {
		mapa.getMapa().agregar(this);
	}

	public void aceptarVisitor(Visitor v) {
		v.visitar(this);
	}

	public void actuar() {
		Iterator<Enemigo> itEnemigos = mapa.getMapa().getEnemigos().iterator();
		Enemigo enemigo;
		boolean encontreColision = false;
		while (itEnemigos.hasNext() && encontreColision == false) {
			enemigo = (Enemigo) itEnemigos.next();
			if (this.getPosicionY() == enemigo.getPosicionY()
					&& enemigo.getPosicionX() - this.getPosicionX() <= this.getRango() + 50
					&& enemigo.getPosicionX() - this.getPosicionX() >= 10) {
				enemigo.aceptarVisitor(this.getVisitor());
				encontreColision = true;
			}

		}
		if (encontreColision == false)
			estado.cambiarACaminando();
	}
}
