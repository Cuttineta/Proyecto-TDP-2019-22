package Estado;

import Entidad.Personaje;

public class Caminando extends Estado {

	public Caminando(Personaje personaje) {
		super(personaje);
	}
	public void actuar() {
		personaje.cambiarGraficoEstatico();

	}
	
	public void mover() {
		
		personaje.setPosicionX(personaje.getPosicionX()-personaje.getVelocidad());
		
	}
	
	public void cambiarAQuieto(Personaje p) {}

}