package Visitor;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import PowerUp.CampoDeProteccion;

public abstract class Visitor {
	
	protected Entidad miEntidad;
	
	public abstract void visitar(Aliado a);
	
	public abstract void visitar(Enemigo e);
	
	public abstract void visitar(Entidad e);
	public abstract void visitar(ObjetoVida e);
	public abstract void visitar(ObjetoTiempo e);
	public abstract void visitar(CampoDeProteccion e);

	
	
	
	
	
	
	
}
