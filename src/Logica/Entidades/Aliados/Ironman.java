package Logica.Entidades.Aliados;

import Grafica.Entidades.Aliados.IronmanGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;

public class Ironman extends Aliado {

	public Ironman(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new ColisionadorDefensor(this);
		this.grafico = new IronmanGrafico(x, y, m.getPanelMapa(), this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		Ironman ret = new Ironman( cost, cost, mapa);
		try {
			ret = (Ironman)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
