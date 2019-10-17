package Logica.Entidades.Aliados;

import Grafica.Entidades.Aliados.DrStrangeGrafico;
import Logica.Colisionadores.VisitorAliado;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;

public class DrStrange extends Aliado {

	public DrStrange(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new VisitorAliado(this);
		this.grafico = new DrStrangeGrafico(x, y, m.getPanelMapa(), this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		DrStrange ret = new DrStrange( cost, cost, mapa);
		try {
			ret = (DrStrange)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
