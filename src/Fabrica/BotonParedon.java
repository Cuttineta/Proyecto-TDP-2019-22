package Fabrica;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Aliados.CapAmerica;
import Objetos.Bomba;
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
