package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoNebula;
import Disparo.DisparoUltron;
import Estado.Caminando;
import Visitor.Visitor;

public class Ultron extends Enemigo {

	public Ultron() {
		vida = 3;
		danio = 50;
		recompensa = 10;
		velocidad = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Ultron/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Ultron/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarUltron(this);		
	}
	
	public void crearDisparo() {
		DisparoUltron disparo = new DisparoUltron(danio, 20, posicionX, posicionY);
		
	}
}
