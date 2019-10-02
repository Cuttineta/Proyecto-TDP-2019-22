package Factory;


import java.awt.Point;

import Aliado.Hawkeye;
import Entidad.Personaje;

public class FabricaConcretaHawkeye extends FabricaConcretaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new Hawkeye(p);
	}

}