package Fabrica;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.Thor;
import Tienda.tienda;

public class BotonThor extends Boton {

	private static final long serialVersionUID = 1L;

	public BotonThor(tienda t) {
		super(t);
	}

	@Override
	public Aliado crearPersonaje() {
		return new Thor();
	}

}
