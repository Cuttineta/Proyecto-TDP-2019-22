package Fabrica;

import Entidad.Entidad;
import Entidad.Aliados.Hawkeye;
import Tienda.tienda;

public class BotonHawkeye extends Boton {

	public BotonHawkeye(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Entidad crearEntidad() {
		return new Hawkeye();
	}

}
