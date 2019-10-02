package Factory;

import java.awt.Point;

import Aliado.Hulk;
import Entidad.Personaje;

public class FabricaConcretaHulk implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new Hulk(p);
	}

}
