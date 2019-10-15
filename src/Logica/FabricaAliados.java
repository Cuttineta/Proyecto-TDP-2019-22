package Logica;

import Logica.Entidades.Aliados.DrStrange;
import Logica.Entidades.Aliados.Aliado;
import Logica.Entidades.Aliados.Ironman;
import Logica.Entidades.Aliados.Hulk;
import Logica.Entidades.Aliados.Hawkeye;
import Logica.Entidades.Aliados.CapAmerica;
import Logica.Entidades.Aliados.Thor;
import Logica.Mapa.Mapa;

public class FabricaAliados{
	
	public FabricaAliados() {
	}

	public Aliado crearCapAmerica(Mapa m) {
		return new CapAmerica(0,0,m) ;
	}

	public Aliado crearDrStrange(Mapa m) {
		return new DrStrange(0,0,m);
	}

	public Aliado crearHawkeye(Mapa m) {
		return new Hawkeye(0,0,m);
	}

	public Aliado crearHulk(Mapa m) {
		return new Hulk(0,0,m);
	}

	public Aliado crearIronman(Mapa m) {
		return new Ironman(0,0,m);
	}

	public Aliado crearThor(Mapa m) {
		return new Thor(0,0,m);
	}

}
