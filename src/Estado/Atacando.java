package Estado;

import Entidad.Personaje;

public class Atacando extends Estado {

	public Atacando(Personaje personaje) {
		super(personaje);
	}
	public void actuar() {
		personaje.cambiarGraficoAtacando();

	}
	
	public void mover() {}
	
	public void cambiarAAtacar() {}

}
