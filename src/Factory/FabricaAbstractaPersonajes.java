package Factory;

import Entidad.Personaje;

public interface FabricaAbstractaPersonajes{
	
		Personaje crearPersonaje(int x,int y);
}
