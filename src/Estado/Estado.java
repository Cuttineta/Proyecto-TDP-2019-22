package Estado;

import Entidad.Personaje;

public abstract class Estado {
	
	protected Personaje personaje;
	
	public Estado(Personaje personaje) {
		this.personaje = personaje;
	}
	
	public abstract void actuar();
	
	public abstract void mover();
	
	public  void cambiarAAtacar() {
		personaje.setEstado(new Atacando(personaje));
		personaje.getEstado().actuar();
	}
	
	public  void cambiarACaminando() {
		personaje.setEstado(new Caminando(personaje));
		personaje.getEstado().actuar();
	}
	public  void cambiarAMuerto() {
		personaje.setEstado(new Muerto(personaje));
		personaje.getEstado().actuar();

	}

}
