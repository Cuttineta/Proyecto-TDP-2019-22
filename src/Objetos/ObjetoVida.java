package Objetos;

import Visitor.Visitor;

public abstract class ObjetoVida extends Objeto {
	public void actuar() {
		
	}
	
	public void aceptarVisitor(Visitor v) {
		v.visitar(this);
		
	}
}
