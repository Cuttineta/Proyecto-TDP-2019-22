package Factory;


import java.awt.Point;

import Aliado.DrStrange;
import Entidad.Personaje;

public class FabricaConcretaDrStrange extends FabricaConcretaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new DrStrange(p);
	}

}