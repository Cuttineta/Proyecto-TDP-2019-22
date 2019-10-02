package FactoryPersonajes;

import java.awt.Point;

import Aliado.IronMan;
import Entidad.Personaje;

public class FabricaConcretaIronMan implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new IronMan(x,y);
	}

}
