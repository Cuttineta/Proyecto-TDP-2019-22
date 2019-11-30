package Visitor;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Aliados.CapAmerica;
import Entidad.Aliados.DrStrange;
import Entidad.Aliados.Hawkeye;
import Entidad.Aliados.Hulk;
import Entidad.Aliados.Ironman;
import Entidad.Aliados.Thor;
import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.Nebula;
import Entidad.Enemigos.SentryUltron;
import Entidad.Enemigos.Surtur;
import Entidad.Enemigos.Thanos;
import Entidad.Enemigos.Ultron;
import Entidad.Enemigos.Yondu;
import Objetos.Objeto;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import Objetos.Roca;
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