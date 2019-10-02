package Factory;

import Aliado.Thor;
import Entidad.Personaje;

public class FabricaConcretaThor extends FabricaConcretaPersonajes {

	@Override
	public Personaje crearPersonaje(int x,int y) {
		return new Thor(x,y);
	}

}