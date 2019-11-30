package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoAliado.DisparoDrStrange;
import Estado.Caminando;
import Visitor.Visitor;

public class DrStrange extends Aliado {

	public DrStrange() {
		rango = 180;
		vidaInicial = 10;
		vida = vidaInicial;
		precio = 25;
		danio = 4;
		estatico = new ImageIcon("Sprites/Aliados/Dr Strange/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Dr Strange/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();

	}

	

	@Override
	public void crearDisparo() {
		DisparoDrStrange disparo = new DisparoDrStrange(4, rango, posicionX, posicionY);
		
	}

}
