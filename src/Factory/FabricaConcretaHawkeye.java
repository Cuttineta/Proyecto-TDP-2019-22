package Factory;


import java.awt.Point;

import Aliado.Hawkeye;
import Entidad.Personaje;

public class FabricaConcretaHawkeye implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new Hawkeye(p);
	}

}