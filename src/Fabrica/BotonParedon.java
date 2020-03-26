package Fabrica;

import Entidad.Entidad;
import Objetos.Paredon;
import Tienda.tienda;

public class BotonParedon extends Boton {

	public BotonParedon(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Entidad crearEntidad() {
		return new Paredon();
	}

}
