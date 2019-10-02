package Aliado;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Hawkeye extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;
	private ImageIcon i = new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hawkeye/estatico.png"));

	public Hawkeye(Point p) {
		super(p);
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
