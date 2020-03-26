package Fabrica;

import Entidad.Entidad;
import Entidad.Aliados.Ironman;
import Tienda.tienda;

public class BotonIronman extends Boton {

	public BotonIronman(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Entidad crearEntidad() {
		return new Ironman();
	}

}