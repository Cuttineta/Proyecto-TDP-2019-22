package Logica.Entidades.Aliados;

import Grafica.Entidades.Aliados.ThorGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;

public class Thor extends Aliado {

	public Thor(int x,int y,Mapa m) {
		super(x,y,m);
		super.col = new ColisionadorDefensor(this);
		this.grafico=new ThorGrafico(x,y,m.getPanelMapa(),this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		Thor ret = new Thor(cost, cost, mapa);
		try {
			ret = (Thor)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

}
