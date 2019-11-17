package Fabrica;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.Hawkeye;
import Tienda.tienda;

public class BotonHawkeye extends Boton {

	public BotonHawkeye(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Aliado crearPersonaje() {
		return new Hawkeye();
	}

}
