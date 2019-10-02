package Aliado;

import javax.swing.ImageIcon;

public class Thor extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;
	private ImageIcon i = new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Thor/estatico.png"));

	public Thor(int x, int y) {
		super(x,y);
		vida = MAX_VIDA;
		alcance = ALCANCE;
		impacto = IMPACTO;
		precio = 50;
		img.setIcon(i);
	}

	@Override
	public int getVida() {
		return vida;
	}
	
	@Override
	public int getImpacto() {
		return impacto;
	}
	
	@Override
	public int getAlcance() {
		return alcance;
	}
	
	@Override
	public int getPrecio() {
		return precio;
	}
	
	@Override
	public boolean enEspera() {
		return esperando;
	}
}