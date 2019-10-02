package Aliado;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Hulk extends Aliado {

	private static final int ALCANCE = 1, IMPACTO = 20;
	private ImageIcon i = new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hulk/h estatico.png"));

	public Hulk(Point p) {
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