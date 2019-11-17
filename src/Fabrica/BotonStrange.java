package Fabrica;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.DrStrange;
import Tienda.tienda;

public class BotonStrange extends Boton {

	public BotonStrange(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Aliado crearPersonaje() {
		return new DrStrange();
	}

}
