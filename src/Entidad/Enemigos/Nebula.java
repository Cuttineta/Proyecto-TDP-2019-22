package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoNebula;
import Estado.Caminando;

public class Nebula extends Enemigo {

	public Nebula() {
		vida = 15;
		danio = 30;
		recompensa = 10;
		velocidad = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Nebula/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Nebula/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarNebula(this);	

	}
	
	public void crearDisparo() {
		DisparoNebula disparo = new DisparoNebula(danio, 20, posicionX, posicionY);
		
	}
}

