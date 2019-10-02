package FactoryPersonajes;

import java.awt.Point;

import Aliado.Hulk;
import Entidad.Personaje;

public class FabricaConcretaHulk implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new Hulk(x,y);
	}

}
