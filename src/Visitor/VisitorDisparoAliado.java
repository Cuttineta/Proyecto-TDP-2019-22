package Visitor;

import Disparo.DisparoAliado.DisparoAliado;
import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import PowerUp.CampoDeMuerte;
import PowerUp.CampoDeProteccion;

public class VisitorDisparoAliado extends Visitor {
	protected DisparoAliado disparo;

	public VisitorDisparoAliado(DisparoAliado d) {
		disparo = d;
	}

	@Override
	public void visitar(Aliado a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitar(Enemigo e) {
		e.setVida(e.getVida() - disparo.getDanio());
		disparo.eliminarDisparo();
		disparo.eliminarDeLaLista();

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
		disparo.eliminarDisparo();
		disparo.eliminarDeLaLista();
		
	}
	
	public void visitar(CampoDeMuerte e) {
		disparo.eliminarDisparo();
		disparo.eliminarDeLaLista();
		
	}

}