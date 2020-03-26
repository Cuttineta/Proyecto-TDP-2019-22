package Fabrica;

import Entidad.Entidad;
import Objetos.Bomba;
import Tienda.tienda;

public class BotonBomba extends Boton {

	public BotonBomba(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Entidad crearEntidad() {
		return new Bomba();
	}

}