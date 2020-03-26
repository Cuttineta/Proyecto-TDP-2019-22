package Visitor;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import PowerUp.CampoDeProteccion;

public class VisitorAliado extends Visitor {
	
	protected Aliado aliado;
	
	public VisitorAliado(Aliado a) {
		aliado =a;
	}

	public void visitar(Aliado a) {
	
	}

	@Override
	public void visitar(Enemigo e) {
		aliado.atacar();
		
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