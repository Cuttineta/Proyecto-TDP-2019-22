package Factory;


import java.awt.Point;

import Aliado.DrStrange;
import Entidad.Personaje;

public class FabricaConcretaDrStrange implements FabricaAbstractaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new DrStrange(x,y);
	}

}