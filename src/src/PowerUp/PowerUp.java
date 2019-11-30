package PowerUp;

import Entidad.Entidad;
import Entidad.Personaje;
import Mapa.mapa;

public abstract class PowerUp extends Entidad{
	protected Personaje personaje;
	
	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
		
	}
	public Personaje getPersonaje() {
		return personaje;
	}
	@Override
	public void agregarALaLista() {
		mapa.getMapa().agregar(this);
		
	}

	@Override
	public void eliminarDeLaLista() {
		mapa.getMapa().eliminar(this);
		
	}

}
