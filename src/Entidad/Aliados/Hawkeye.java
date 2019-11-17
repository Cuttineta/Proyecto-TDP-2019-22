package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoDrStrange;
import Disparo.DisparoHawkeye;
import Estado.Caminando;
import Visitor.Visitor;

public class Hawkeye extends Aliado {

	public Hawkeye() {
		rango = 200;
		vida = 80;
		precio = 25;
		danio = 30;
		estatico = new ImageIcon("Sprites/Aliados/Hawkeye/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Hawkeye/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarHawkeye(this);		
	}
	
	public void crearDisparo() {
		DisparoHawkeye disparo = new DisparoHawkeye(danio, rango, posicionX, posicionY);
		
	}

}
