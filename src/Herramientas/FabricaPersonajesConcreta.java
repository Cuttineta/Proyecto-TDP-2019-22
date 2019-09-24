package Herramientas;

import Entidad.*;
import Mapa.Celda;

public class FabricaPersonajesConcreta implements FabricaPersonajes {

	@Override
	public Personaje crearIronMan(Celda c) {
		return new IronMan(c);
	}

	@Override
	public Personaje crearThor(Celda c) {
		return new Thor(c);
	}

	@Override
	public Personaje crearHawkeye(Celda c) {
		return new Hawkeye(c);
	}

	@Override
	public Personaje crearHulk(Celda c) {
		return new Hulk(c);
	}

	@Override
	public Personaje crearCapAmerica(Celda c) {
		return new Cap_America(c);
	}

	@Override
	public Personaje crearDrStrange(Celda c) {
		return new DrStrange(c);
	}

	@Override
	public Personaje crearThanos(Celda c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personaje crearUltron(Celda c) {
		// TODO Auto-generated method stub
		return null;
	}

}
