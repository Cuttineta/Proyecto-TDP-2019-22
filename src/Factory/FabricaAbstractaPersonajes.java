package Factory;

import java.awt.Point;

import Entidad.Personaje;

public interface FabricaAbstractaPersonajes{
	
		Personaje crearPersonaje(Point p);
}
