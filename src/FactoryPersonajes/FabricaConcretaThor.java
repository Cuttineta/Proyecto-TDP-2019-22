package FactoryPersonajes;

import Aliado.Thor;
import Entidad.Personaje;

public class FabricaConcretaThor implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new Thor(x,y);
	}

}