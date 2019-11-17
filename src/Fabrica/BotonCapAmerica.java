package Fabrica;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.CapAmerica;
import Tienda.tienda;

public class BotonCapAmerica extends Boton {

	public BotonCapAmerica(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Aliado crearPersonaje() {
		return new CapAmerica();
	}

}