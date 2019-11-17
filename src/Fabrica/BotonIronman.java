package Fabrica;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.Ironman;
import Tienda.tienda;

public class BotonIronman extends Boton{
	
	public BotonIronman(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Aliado crearPersonaje() {
		return new Ironman();
	}

}