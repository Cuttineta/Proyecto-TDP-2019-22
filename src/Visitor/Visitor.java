package Visitor;

import Entidad.Enemigos.*;
import Objetos.Objeto;
import Objetos.ObjetoTiempo;
import Objetos.ObjetoVida;
import Objetos.Roca;
import PowerUp.CampoDeProteccion;
import Entidad.Entidad;
import Entidad.Aliados.*;

public abstract class Visitor {
	
	protected Entidad miEntidad;
	
	public abstract void visitar(Aliado a);
	
	public abstract void visitar(Enemigo e);
	
	public abstract void visitar(Entidad e);
	public abstract void visitar(ObjetoVida e);
	public abstract void visitar(ObjetoTiempo e);
	public abstract void visitar(CampoDeProteccion e);

	
	
	
	
	
	
	
}
