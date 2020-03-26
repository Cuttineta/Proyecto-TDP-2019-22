package Entidad.Aliados;

import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoAliado.DisparoHulk;
import Entidad.Enemigos.Enemigo;
import Estado.Caminando;
import Mapa.mapa;

public class Hulk extends Aliado {

	private HulkSegundaParte otraParte;

	public Hulk() {
		rango = 25;
		vidaInicial = 12;
		vida = vidaInicial;
		precio = 20;
		danio = 4;
		estatico = new ImageIcon("Sprites/Aliados/Hulk/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Hulk/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
		otraParte = new HulkSegundaParte(this);
	}

	public void actuar() {
		Iterator itEnemigos = mapa.getMapa().getEnemigos().iterator();
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

			if (this.getPosicionY() + 116 == enemigo.getPosicionY()
					&& enemigo.getPosicionX() - this.getPosicionX() <= this.getRango() + 50
					&& enemigo.getPosicionX() - this.getPosicionX() >= 10) {
				enemigo.aceptarVisitor(otraParte.getVisitor());
				encontreColision = true;
			}

		}
		if (encontreColision == false)
			estado.cambiarACaminando();
	}

	public void crearDisparo() {
		DisparoHulk disparo = new DisparoHulk(danio, rango, posicionX, posicionY);

	}

	public Aliado getSegundaParte() {
		return otraParte;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
		if (grafico != null) {
			grafico.setBounds(posicionX, posicionY, 100, 200);
		}
		otraParte.setPosicionY(posicionY + 116);
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
		if (grafico != null) {
			grafico.setBounds(posicionX, posicionY, 100, 200);
			otraParte.setPosicionX(posicionX);
		}
	}

	public void eliminarDeLaLista() {
		mapa.getMapa().eliminar(this);
		mapa.getMapa().eliminar(otraParte);
	}

}
