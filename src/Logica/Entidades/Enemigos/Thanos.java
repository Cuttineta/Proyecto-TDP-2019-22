package Logica.Entidades.Enemigos;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Enemigos.ThanosGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Thanos extends Enemigo {

	public Thanos(int x, int y, Mapa m) {
		super(x, y, m);
		this.life = 200;
		this.damage = 30;
		this.attackSpeed = 5;
		this.movementSpeed = 2;
		this.range = 3;
		this.grafico = new ThanosGrafico(x, y, m.getPanelMapa(), this);
		super.col = new ColisionadorAtacante(this);
	}

	@Override
	public void setLife(int lp) {

	}

	@Override
	public EntidadGrafica getGrafico() {
		return grafico;
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		Thanos thanos = new Thanos(movementSpeed, movementSpeed, mapa);
		try {
			thanos = (Thanos)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thanos;
	}

}
