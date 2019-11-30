package Visitor;

import Disparo.DisparoAliado.DisparoAliado;
import Disparo.DisparoEnemigo.DisparoEnemigo;
import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Objetos.Objeto;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import Objetos.Roca;
import PowerUp.CampoDeProteccion;

public class VisitorDisparoEnemigo extends Visitor {
	protected DisparoEnemigo disparo;

	public VisitorDisparoEnemigo(DisparoEnemigo d) {
		disparo = d;
	}

	@Override
	public void visitar(Aliado a) {
		a.setVida(a.getVida() - disparo.getDanio());
		disparo.eliminarDisparo();
		disparo.eliminarDeLaLista();

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
		e.setVida(e.getVida() - disparo.getDanio());
		disparo.eliminarDisparo();
		disparo.eliminarDeLaLista();
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

}
