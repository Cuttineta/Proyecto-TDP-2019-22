package Entidad;

public abstract class Aliado extends Personaje {
	
	protected static final int MAX_VIDA = 100;
	protected int vida, alcance, impacto;

	public int getVida() {
		return vida;
	}
		
	public int getAlcance() {
		return alcance;
	}	

	public int getImpacto() {
		return impacto;
	}
}
