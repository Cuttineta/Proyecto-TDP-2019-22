package Factory;

import java.awt.Point;

import Aliado.IronMan;
import Entidad.Personaje;

public class FabricaConcretaIronMan implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new IronMan(p);
	}

}
