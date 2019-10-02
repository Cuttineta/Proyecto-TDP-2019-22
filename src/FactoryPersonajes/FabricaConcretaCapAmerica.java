package FactoryPersonajes;

import Aliado.Cap_America;
import Entidad.Personaje;

public class FabricaConcretaCapAmerica extends FabricaConcretaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new Cap_America(x,y);
	}

}