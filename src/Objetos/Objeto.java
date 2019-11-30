package Objetos;

import Entidad.Entidad;
import Mapa.mapa;
import Visitor.Visitor;

public abstract class Objeto extends Entidad {

	public abstract void aceptarVisitor(Visitor v);
	public void eliminarDeLaLista() {
		mapa.getMapa().eliminar(this);
		
	}
	
	public void agregarALaLista() {
		mapa.getMapa().agregar(this);
	}
}
 