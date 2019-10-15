package Logica.Mapa.Niveles;

import java.util.LinkedList;
import java.util.Random;
import Logica.Entidades.Entidad;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public class Horda {
	protected ClonadorEntidades clonador;
	protected LinkedList<Entidad> lista;
	protected Random rand;
	protected Mapa mapa;
	
	public Horda(Mapa m) {
		mapa = m;
		clonador = new ClonadorEntidades();
		lista = new LinkedList<Entidad>();
		rand = new Random();
		inicializarHorda();
		Entidad ent = crearAtacante();
		
	}
	
	private void inicializarHorda() {
		lista.add(new Thanos(880, 340, mapa)); // Falta agregar el resto de los enemigos y ubicarlo en el mapa graficamente
		lista.add(new Thanos(0, 0, mapa)); // Falta agregar el resto de los enemigos y ubicarlo en el mapa graficamente
	}
	public Entidad crearAtacante(){
		int i = rand.nextInt(2); 
		return lista.get(i).copyEntidad();
		
	}

}
