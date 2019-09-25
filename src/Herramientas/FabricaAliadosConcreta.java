package Herramientas;

import Entidad.*;
import Mapa.Celda;

public class FabricaAliadosConcreta implements FabricaAliados {

	@Override
	public Aliado crearIronMan(Celda c) {
		return new IronMan(c);
	}

	@Override
	public Aliado crearThor(Celda c) {
		return new Thor(c);
	}

	@Override
	public Aliado crearHawkeye(Celda c) {
		return new Hawkeye(c);
	}

	@Override
	public Aliado crearHulk(Celda c) {
		return new Hulk(c);
	}

	@Override
	public Aliado crearCapAmerica(Celda c) {
		return new Cap_America(c);
	}

	@Override
	public Aliado crearDrStrange(Celda c) {
		return new DrStrange(c);
	}

}
