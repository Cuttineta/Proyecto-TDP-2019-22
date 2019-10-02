package FactoryPersonajes;

import Aliado.Hawkeye;
import Entidad.Personaje;

public class FabricaConcretaHawkeye implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new Hawkeye(x,y);
	}

}