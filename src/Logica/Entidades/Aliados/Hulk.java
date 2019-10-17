package Logica.Entidades.Aliados;

import Grafica.Entidades.Aliados.HulkGrafico;
import Logica.Colisionadores.VisitorAliado;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;

public class Hulk extends Aliado {

	public Hulk(int x, int y, Mapa m) {
		super(x, y, m);
		this.life = 300;
		this.damage = 50;
		this.attackSpeed = 2;
		this.range = 1;
		this.cost = 30;
		this.grafico = new HulkGrafico(x, y, m.getPanelMapa(), this);
		super.col = new VisitorAliado(this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		Hulk ret = new Hulk( cost, cost, mapa);
		try {
			ret = (Hulk)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
