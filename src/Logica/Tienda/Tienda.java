package Logica.Tienda;

import GUI.Paneles.PanelTienda;
import Logica.FabricaAliados;
import Logica.Entidades.Aliados.Aliado;
import Logica.Juego.Juego;

public class Tienda {
	private PanelTienda tienda;
	private Juego juego;
	private Aliado personajeActual;
	private FabricaAliados fabrica;

	public Tienda(Juego j) {
		juego = j;
		tienda = new PanelTienda(this);
		fabrica = new FabricaAliados();
		personajeActual = null;
	}

	public PanelTienda getPanelTienda() {
		return tienda;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setPersonajeActual(Aliado d) {
		personajeActual = d;
	}

	public Aliado getPersonajeActual() {
		Aliado toret = personajeActual;
		personajeActual = null;
		return toret;
	}

	public FabricaAliados getFabrica() {
		return fabrica;
	}

}
