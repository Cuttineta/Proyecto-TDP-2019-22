package Fabrica;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Aliados.DrStrange;
import Entidad.Aliados.Hawkeye;
import Tienda.tienda;

public class BotonStrange extends Boton {

	public BotonStrange(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Entidad crearEntidad() {
		return new DrStrange();
	}

}
