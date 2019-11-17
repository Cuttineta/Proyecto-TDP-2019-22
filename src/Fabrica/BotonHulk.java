package Fabrica;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.Hulk;
import Tienda.tienda;

public class BotonHulk extends Boton{
	
	public BotonHulk(tienda t) {
		super(t);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Aliado crearPersonaje() {
		return new Hulk();
	}
	
}
