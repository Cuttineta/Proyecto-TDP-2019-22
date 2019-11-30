package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoAliado.DisparoDrStrange;
import Disparo.DisparoAliado.DisparoHawkeye;
import Estado.Caminando;
import Visitor.Visitor;

public class Hawkeye extends Aliado {

	public Hawkeye() {
		rango = 200;
		vida = 9;
		precio = 25;
		danio = 2;
		estatico = new ImageIcon("Sprites/Aliados/Hawkeye/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Hawkeye/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	
	
	public void crearDisparo() {
		DisparoHawkeye disparo = new DisparoHawkeye(danio, rango, posicionX, posicionY);
		
	}

}
