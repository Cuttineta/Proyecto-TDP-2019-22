package Herramientas;

import Entidad.Personaje;
import Mapa.Celda;

public interface FabricaPersonajes {
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

}
