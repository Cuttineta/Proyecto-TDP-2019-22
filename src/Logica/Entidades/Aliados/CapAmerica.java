package Logica.Entidades.Aliados;

import Grafica.Entidades.Aliados.CapAmericaGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;

public class CapAmerica extends Aliado {

	public CapAmerica(int x, int y, Mapa m) {//Agregar valores a los atributos
		super(x, y, m);
		this.grafico=new CapAmericaGrafico(x,y,m.getPanelMapa(),this);
		super.col = new ColisionadorDefensor(this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		CapAmerica ret = new CapAmerica(cost, cost, mapa);
		try {
			ret = (CapAmerica)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

}
