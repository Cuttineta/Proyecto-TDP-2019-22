package Disparo.DisparoEnemigo;

import Disparo.Disparo;
import Entidad.Aliados.Aliado;
import Entidad.Aliados.CapAmerica;
import Entidad.Aliados.DrStrange;
import Entidad.Aliados.Hawkeye;
import Entidad.Aliados.Hulk;
import Entidad.Aliados.Ironman;
import Entidad.Aliados.Thor;
import Entidad.Enemigos.Nebula;
import Entidad.Enemigos.SentryUltron;
import Entidad.Enemigos.Surtur;
import Entidad.Enemigos.Thanos;
import Entidad.Enemigos.Ultron;
import Entidad.Enemigos.Yondu;
import Mapa.mapa;
import Objetos.Objeto;
import PowerUp.PowerUp;
import Visitor.Visitor;
import Visitor.VisitorDisparoEnemigo;

public class DisparoEnemigo extends Disparo {

	public DisparoEnemigo(int d, int rango, int x, int y) {
		this.danio = d;
		this.rango = rango;
		setPosicionX(x);
		setPosicionY(y);
		visitor = new VisitorDisparoEnemigo(this);
	}

	public void actuar() {
		
		for (PowerUp power : mapa.getMapa().getPowerUps()) {
			if (this.getPosicionY() == power.getPosicionY() && this.getPosicionX() - power.getPosicionX() <= 20
					&& this.getPosicionX() - power.getPosicionX() >= 6) {
				power.aceptarVisitor(visitor);

			}
		}
		for (Aliado aliado : mapa.getMapa().getAliados()) {
			for (Objeto objeto : mapa.getMapa().getObjetos()) {
				if ((this.getPosicionY() == aliado.getPosicionY() && this.getPosicionX() - aliado.getPosicionX() <= 20
						&& this.getPosicionX() - aliado.getPosicionX() >= 6) 
						) {
					aliado.aceptarVisitor(visitor);

				}
				if(this.getPosicionY() == objeto.getPosicionY() && this.getPosicionX() - objeto.getPosicionX() <= 20
						&& this.getPosicionX() - objeto.getPosicionX() >= 6) {
					objeto.aceptarVisitor(visitor);
				}

			}
		}

		rango = rango - 3;
		if (rango > 0)
			setPosicionX(posicionX - 3);
		else {
			eliminarDisparo();
			eliminarDeLaLista();

		}

	}

	// aliados

	public void visitarHulk(Hulk h) {
		h.setVida(h.getVida() - danio);
		eliminarDisparo();
		eliminarDeLaLista();

	}

	public void visitarThor(Thor t) {
		t.setVida(t.getVida() - danio);
		eliminarDisparo();
		eliminarDeLaLista();

	}

	public void visitarIronman(Ironman i) {
		i.setVida(i.getVida() - danio);
		eliminarDisparo();
		eliminarDeLaLista();

	}

	public void visitarDrStrange(DrStrange d) {
		d.setVida(d.getVida() - danio);
		eliminarDisparo();
		eliminarDeLaLista();

	}

	public void visitarHawkeye(Hawkeye h) {
		h.setVida(h.getVida() - danio);
		eliminarDisparo();
		eliminarDeLaLista();

	}

	public void visitarCapAmerica(CapAmerica h) {
		h.setVida(h.getVida() - danio);
		eliminarDisparo();
		eliminarDeLaLista();

	}

	// enemigos

	public void visitarThanos(Thanos t) {

	}

	public void visitarNebula(Nebula n) {

	}

	public void visitarUltron(Ultron u) {

	}

	public void visitarSentryUltron(SentryUltron s) {

	}

	public void visitarYondu(Yondu y) {

	}

	public void visitarSurtur(Surtur s) {

	}
	public void agregarALaLista() {
		mapa.getMapa().agregar(this);
		
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
