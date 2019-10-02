package FactoryPersonajes;

import Entidad.Personaje;

public interface FabricaAbstractaPersonajes{
	
	public Personaje crearPersonaje(int x,int y);
}
