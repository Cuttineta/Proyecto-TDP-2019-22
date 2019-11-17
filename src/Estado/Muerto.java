package Estado;

import Entidad.Personaje;

public class Muerto extends Estado {

	public Muerto(Personaje personaje) {
		super(personaje);
	}
	
	public void mover() {}

	@Override
	public void actuar() {
		personaje.getGrafico().setVisible(false);
		personaje.eliminarDeLaLista();
	}

	public void cambiarAMuerto(Personaje p) {
	}
}
