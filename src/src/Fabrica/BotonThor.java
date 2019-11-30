package Fabrica;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Aliados.Hawkeye;
import Entidad.Aliados.Thor;
import Tienda.tienda;

public class BotonThor extends Boton {

	private static final long serialVersionUID = 1L;

	public BotonThor(tienda t) {
		super(t);
	}

	public Entidad crearEntidad() {
		return new Thor();
	}
}
