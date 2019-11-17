package Disparo;

import Entidad.*;
import Entidad.Aliados.*;
import Entidad.Enemigos.*;
import Mapa.mapa;

public abstract class Disparo extends Entidad {

	private int danio, rango;

	public Disparo(int danio, int rango, int x, int y) {
		this.danio = danio;
		this.rango = rango;
		setPosicionX(x);
		setPosicionY(y);
		mapa.getMapa().agregarDisparo(this);
	}

	public void mover() {
		rango = rango - 3;
		if (rango > 0)
			setPosicionX(posicionX + 3);
		else {
			eliminarDisparo();
			eliminarDeLaLista();
			
		}

	}

	public void eliminarDisparo() {
		if (grafico != null) {
			grafico.setVisible(false);
			}
		//eliminarDeLaLista()
	}

	public void eliminarDeLaLista() {
		mapa.getMapa().eliminarDisparo(this);
	}


	// Aliados
	public void visitarHulk(Hulk h) {
		h.setVida(h.getVida() - danio);
		
	}

	public void visitarThor(Thor t) {
		if(grafico != null)
		 t.setVida(t.getVida() - danio);
		
	}

	public void visitarIronman(Ironman i) {
		i.setVida(i.getVida() - danio);
		
	}

	public void visitarDrStrange(DrStrange d) {
		d.setVida(d.getVida() - danio);
		
	}

	public void visitarHawkeye(Hawkeye h) {
		h.setVida(h.getVida() - danio);
		
	}

	public void visitarCapAmerica(CapAmerica h) {
		h.setVida(h.getVida() - danio);
		
	}

	// enemigos
	public void visitarThanos(Thanos t) {
		t.setVida(t.getVida() - danio);
		
	}

	public void visitarNebula(Nebula n) {
		n.setVida(n.getVida() - danio);
		
	}

	public void visitarUltron(Ultron u) {
		u.setVida(u.getVida() - danio);
		
	}

	public void visitarSentryUltron(SentryUltron s) {
		s.setVida(s.getVida() - danio);
		
	}

	public void visitarYondu(Yondu y) {
		y.setVida(y.getVida() - danio);
		
	}

	public void visitarSurtur(Surtur s) {
		s.setVida(s.getVida() - danio);
		}
}
