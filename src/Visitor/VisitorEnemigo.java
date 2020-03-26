package Visitor;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import PowerUp.CampoDeProteccion;

public class VisitorEnemigo extends Visitor {
	
	protected Enemigo enemigo;
	
	public VisitorEnemigo(Enemigo e) {
		enemigo = e;
	}

	public void visitar(Aliado a) {
		enemigo.atacar();
	
	}

	@Override
	public void visitar(Enemigo e) {
		
		
	}

	@Override
	public void visitar(Entidad e) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void visitar(ObjetoVida e) {
		enemigo.atacar();
		
	}
	
	public void visitar(ObjetoTiempo e) {
		enemigo.setVelocidad(enemigo.getVelocidad()-1);
		
	}

	@Override
	public void visitar(CampoDeProteccion e) {
		// TODO Auto-generated method stub
		
	}

	

}
