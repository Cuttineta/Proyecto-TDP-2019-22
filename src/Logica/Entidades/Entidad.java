package Logica.Entidades;

import java.awt.Point;

import Grafica.Entidades.EntidadGrafica;
import Logica.Colisionadores.Visitor;
import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public abstract class Entidad implements Prototype{
	protected int life;
	protected Posicion miCelda;
	protected Mapa mapa;
	protected boolean mover;
	protected boolean atacar;
	protected EntidadGrafica grafico;
	protected int lugarEnMapa;
	protected Visitor col;

	public Entidad(int x, int y, Mapa m) {
		mapa = m;
		mover = true;
		atacar = false;
		miCelda = new Posicion(x, y);
		grafico = new EntidadGrafica(x, y, m.getPanelMapa(), this);
	}

	public Visitor getColisionador() {
		return col;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int lp) {
		life = life - lp;
	}
	
	public boolean mePuedoMover() {
		return mover;
	}

	public void mover(boolean mov) {
		mover = mov;
	}

	public boolean puedoAtacar() {
		return atacar;
	}

	public void atacar(boolean atac) {
		atacar = atac;
	}

	public Posicion getPos() {
		return miCelda;
	}

	public void setPos(Posicion c) {
		miCelda = c;
	}

	public void cambiarPosLogica(int x, int y) {
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
	}

	public EntidadGrafica getGrafico() {
		return grafico;
	}

	public void setX(int x) {
		grafico.setX(x);
		Point p = miCelda.getPunto();
		p.setLocation(x, p.getY());
	}

	public void setY(int y) {
		grafico.setY(y);
		Point p = miCelda.getPunto();
		p.setLocation(p.getX(), y);
	}

	public void setLugarEnMapa(int i) {
		lugarEnMapa = i;
	}

	public int getLugarEnMapa() {
		return lugarEnMapa;
	}

	public abstract void chocar(Entidad e);
}
