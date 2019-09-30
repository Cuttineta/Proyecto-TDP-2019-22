package Herramientas;

import Entidad.Personaje;
import Game.Celda;

public interface FabricaAbstractaPersonajes {
	
	// Aliados
		Personaje crearIronMan(Celda c);

		Personaje crearThor(Celda c);

		Personaje crearHawkeye(Celda c);

		Personaje crearHulk(Celda c);

		Personaje crearCapAmerica(Celda c);

		Personaje crearDrStrange(Celda c);

	// Enemigos
		
		Personaje crearThanos(Celda c);
		
		Personaje crearUltron(Celda c);

		Personaje crearUltronSentry(Celda c);
		
		Personaje crearNebula(Celda c);
		
		Personaje crearYondu(Celda c);
		
		Personaje crearSurtur(Celda c);
}
