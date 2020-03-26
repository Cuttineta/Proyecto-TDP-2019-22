package Disparo.DisparoAliado;

import Disparo.Disparo;
import Entidad.Enemigos.Enemigo;
import Mapa.mapa;
import PowerUp.PowerUp;
import Visitor.Visitor;
import Visitor.VisitorDisparoAliado;

public class DisparoAliado extends Disparo {

	public DisparoAliado(int d, int rango, int x, int y) {
		this.danio = d;
		this.rango = rango;
		setPosicionX(x);
		setPosicionY(y);
		visitor = new VisitorDisparoAliado(this);
	}

	public void actuar() {
		boolean colision=false;
		for (PowerUp power : mapa.getMapa().getPowerUps()) {
			if (this.getPosicionY() == power.getPosicionY() && power.getPosicionX() - this.getPosicionX() <= 40
					&& power.getPosicionX() - this.getPosicionX() >= 25) {
				power.aceptarVisitor(visitor);
				colision = true; 

			}
		}
		
		if(colision == false) {
			for (Enemigo enemigo : mapa.getMapa().getEnemigos()) {
				if (this.getPosicionY() == enemigo.getPosicionY() && enemigo.getPosicionX() - this.getPosicionX() <= 40
						&& enemigo.getPosicionX() - this.getPosicionX() >= 20) {
					enemigo.aceptarVisitor(visitor);

				}
			}
		}
		

		rango = rango - 3;
		if (rango > 0)
			setPosicionX(posicionX + 3);
		else {
			eliminarDisparo();
			eliminarDeLaLista();

		}

	}

	@Override
	public void agregarALaLista() {
		mapa.getMapa().agregar(this);

	}

	@Override
	public void aceptarVisitor(Visitor v) {
		// TODO Auto-generated method stub

	}

}
