package Fabrica;

import Entidad.Entidad;
import Entidad.Aliados.Hulk;
import Tienda.tienda;

public class BotonHulk extends Boton {

	public BotonHulk(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Entidad crearEntidad() {
		Hulk hulk = new Hulk();
		tienda.getTienda(null).setPersonajeAColocarAux(hulk.getSegundaParte());
		return hulk;
	}

}
