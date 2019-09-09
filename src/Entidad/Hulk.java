package Entidad;

public class Hulk extends Aliado {

	private static final int ALCANCE_HULK=1,IMPACTO_HULK=20;
	
	public Hulk() {
		vida = MAX_VIDA;
		alcance = ALCANCE_HULK;
		impacto = IMPACTO_HULK;
	}
}