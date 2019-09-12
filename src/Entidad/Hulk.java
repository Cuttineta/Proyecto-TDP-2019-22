package Entidad;

public class Hulk extends Aliado {

	private static final int ALCANCE=1,IMPACTO=20;
	
	public Hulk() {
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
	}
}