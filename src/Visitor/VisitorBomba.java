package Visitor;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Objetos.Bomba;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import PowerUp.CampoDeProteccion;

public class VisitorBomba extends Visitor {
	
	public VisitorBomba() {
		
	}

	@Override
	public void visitar(Aliado a) {
		a.setVida(0);
		

	}

	@Override
	public void visitar(Enemigo e) {
		e.setVida(0);

	}

	@Override
	public void visitar(Entidad e) {
		// TODO Auto-generated method stub

	} 

	@Override
	public void visitar(ObjetoVida e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitar(ObjetoTiempo e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitar(CampoDeProteccion e) {
		
	}

}
