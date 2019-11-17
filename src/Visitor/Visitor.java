package Visitor;

import Entidad.Enemigos.*;
import Entidad.Entidad;
import Entidad.Aliados.*;

public abstract class Visitor {
	
	protected Entidad miEntidad;
	
	//Aliados
	public abstract void visitarHulk(Hulk h);
	
	public abstract void visitarIronman(Ironman i);
	
	public abstract void visitarDrStrange(DrStrange d);
	
	public abstract void visitarCapAmerica(CapAmerica c);
	
	public abstract void visitarHawkeye(Hawkeye h);
	
	public abstract void visitarThor(Thor t);
	
	//Enemigos
	public abstract void visitarThanos(Thanos t);
	
	public abstract void visitarSurtur(Surtur s);
	
	public abstract void visitarYondu(Yondu y);
	
	public abstract void visitarNebula(Nebula n);
	
	public abstract void visitarUltron(Ultron u);
	
	public abstract void visitarSentryUltron(SentryUltron s);
	
	
	
	
}
