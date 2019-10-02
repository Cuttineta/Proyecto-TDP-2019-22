package Factory;

import java.awt.Point;

import Aliado.Thor;
import Entidad.Personaje;

public class FabricaConcretaThor implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new Thor(p);
	}

}