package FactoryPersonajes;

import java.awt.Point;

import Aliado.IronMan;
import Entidad.Personaje;

public class FabricaConcretaIronMan extends FabricaConcretaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new IronMan(p);
	}

}
