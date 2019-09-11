package Entidad;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Celda;

public class Thor extends Aliado {

	private static final int ALCANCE_THOR = 1, IMPACTO_THOR = 20;

	public Thor(Celda c) {
		super(c);
		this.grafico = new JLabel(new ImageIcon("Imagenes/Sprites/Aliados/Thor/estatico.png"));
		vida = MAX_VIDA;
		alcance = ALCANCE_THOR;
		impacto = IMPACTO_THOR;
	}
}