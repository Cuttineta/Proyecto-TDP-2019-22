package Logica.Entidades.Aliados;

import Grafica.Entidades.Aliados.HawkeyeGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;

public class Hawkeye extends Aliado {

	public Hawkeye(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new ColisionadorDefensor(this);
		this.grafico = new HawkeyeGrafico(x, y, m.getPanelMapa(), this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		Hawkeye ret = new Hawkeye( cost, cost, mapa);
		try {
			ret = (Hawkeye)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}
