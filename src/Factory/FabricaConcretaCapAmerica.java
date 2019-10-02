package Factory;

import java.awt.Point;

import Aliado.Cap_America;
import Entidad.Personaje;

public class FabricaConcretaCapAmerica implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new Cap_America(p);
	}

}