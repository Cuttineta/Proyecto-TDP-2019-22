package Logica.Colisionadores;

import Logica.Entidades.Aliados.DrStrange;
import Logica.Entidades.Aliados.Aliado;
import Logica.Entidades.Aliados.Ironman;
import Logica.Entidades.Aliados.Hulk;
import Logica.Entidades.Aliados.Hawkeye;
import Logica.Entidades.Aliados.CapAmerica;
import Logica.Entidades.Aliados.Thor;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Entidades.Obstaculos.Barro;
import Logica.Entidades.Obstaculos.Piedra;

public class VisitorAliado extends Visitor{

	private Aliado d;
	
	public VisitorAliado(Aliado def) {
		d = def;
	}

	@Override
	public void serChocado(Thanos e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(DrStrange e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Ironman e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Hulk e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Hawkeye e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(CapAmerica e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Thor e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Piedra e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub
		
	}
	

}