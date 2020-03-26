package Estado;

import Entidad.Personaje;
import Juego.Juego;
import Tienda.tienda;

public class Muerto extends Estado {

	public Muerto(Personaje personaje) {
		super(personaje);
	}
	
	public void mover() {}

	@Override
	public void actuar() {
		despuesDeMorir(personaje);
		personaje.getGrafico().setVisible(false);
		personaje.eliminarDeLaLista();
	}
	
	public void despuesDeMorir(Personaje e) {
		tienda.getTienda(null).sumarMonedas(e.getRecompensaMonedas());
		Juego.getJuego(null).sumarPuntosPartida(e.getRecompensaPuntos());
	}

	public void cambiarAMuerto() {
	}
}
