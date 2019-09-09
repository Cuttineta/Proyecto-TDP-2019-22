package juego;

public class Thor extends Aliado {

	private static final int ALCANCE_THOR=1,IMPACTO_THOR=20;
	
	public Thor() {
		vida = MAX_VIDA;
		alcance = ALCANCE_THOR;
		impacto = IMPACTO_THOR;
	}
}