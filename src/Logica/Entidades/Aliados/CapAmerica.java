package Logica.Entidades.Aliados;

import Grafica.Entidades.Aliados.CapAmericaGrafico;
import Logica.Colisionadores.VisitorAliado;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;

public class CapAmerica extends Aliado {

	public CapAmerica(int x, int y, Mapa m) {//Agregar valores a los atributos
		super(x, y, m);
		this.grafico=new CapAmericaGrafico(x,y,m.getPanelMapa(),this);
		super.col = new VisitorAliado(this);
	}

	public Aliado crear(Mapa m) {
		return new CapAmerica(0,0,m);
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
			e.printStackTrace();
		}
		return ret;
	}

}
