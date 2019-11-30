package Disparo;

import Entidad.*;
import Entidad.Aliados.*;
import Entidad.Enemigos.*;
import Mapa.mapa;

public abstract class Disparo extends Entidad {

	protected int rango;
	
	public Disparo() {
		mapa.getMapa().agregar(this);
	}


	public abstract void actuar();

	public void eliminarDisparo() {
		if (grafico != null) {
			grafico.setVisible(false);
		}
		// eliminarDeLaLista()
	}

	public void eliminarDeLaLista() {
		mapa.getMapa().eliminar(this);
	}

}
