package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoAliado.DisparoIronman;
import Estado.Caminando;
import Visitor.Visitor;

public class Ironman extends Aliado {

	public Ironman() {
		rango = 300;
		vida = 6;
		precio = 25;
		this.danio = 3;
		estatico = new ImageIcon("Sprites/Aliados/Ironman/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Ironman/atacando.gif");	
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}
	
	public void crearDisparo() {
		DisparoIronman disparo = new DisparoIronman(danio, rango, posicionX, posicionY);
		
	}

	
}
