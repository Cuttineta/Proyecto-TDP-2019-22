package Herramientas;

import Entidad.*;
import Enemigo.*;
import Mapa.Celda;

public class FabricaConcreta implements FabricaAbstracta{

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
		return new Thanos(c);
	}

	@Override
	public Personaje crearUltron(Celda c) {
		return new Ultron(c);
	}

	@Override
	public Personaje crearUltronSentry(Celda c) {
		return new UltronSentry(c);
	}

	@Override
	public Personaje crearNebula(Celda c) {
		return new Nebula(c);
	}

	@Override
	public Personaje crearYondu(Celda c) {
		return new Yondu(c);
	}

	@Override
	public Personaje crearSurtur(Celda c) {
		return new Surtur(c);
	}

}
