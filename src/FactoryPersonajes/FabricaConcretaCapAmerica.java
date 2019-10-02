package FactoryPersonajes;

import Aliado.Cap_America;
import Entidad.Personaje;

public class FabricaConcretaCapAmerica implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new Cap_America(x,y);
	}

}