package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoDrStrange;
import Estado.Caminando;
import Visitor.Visitor;

public class DrStrange extends Aliado {

	public DrStrange() {
		rango = 180;
		vida = 80;
		precio = 25;
		danio = 4;
		estatico = new ImageIcon("Sprites/Aliados/Dr Strange/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Dr Strange/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();

	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarDrStrange(this);		
	}

	@Override
	public void crearDisparo() {
		DisparoDrStrange disparo = new DisparoDrStrange(danio, rango, posicionX, posicionY);
		
	}

}
