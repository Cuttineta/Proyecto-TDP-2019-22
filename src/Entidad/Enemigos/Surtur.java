package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoNebula;
import Disparo.DisparoSurtur;
import Estado.Caminando;
import Visitor.Visitor;

public class Surtur extends Enemigo {

	public Surtur() {
		vida = 12;
		danio = 45;
		recompensa = 10;
		velocidad =3;
		estatico = new ImageIcon("Sprites/Enemigos/Surtur/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Surtur/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarSurtur(this);		
	}
	
	public void crearDisparo() {
		DisparoSurtur disparo = new DisparoSurtur(danio, 20, posicionX, posicionY);
		
	}
}
