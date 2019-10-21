package Boton;

import Logica.Entidades.Aliados.Aliado;
import Logica.Entidades.Aliados.Hulk;
import Logica.Mapa.Mapa;

public class BotonHulk extends BotonAliado {

	@Override
	public Aliado crearPersonaje(Mapa m) {
		return new Hulk(0,0,m);
	}

}
