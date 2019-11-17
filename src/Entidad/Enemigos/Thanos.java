package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoNebula;
import Disparo.DisparoThanos;
import Estado.Atacando;
import Estado.Caminando;
import Visitor.Visitor;

public class Thanos extends Enemigo {

	public Thanos() {
		vida = 15;
		danio = 5;
		recompensa = 10;
		velocidad = 3;
		estatico = new ImageIcon("Sprites/Enemigos/Thanos/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Thanos/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarThanos(this);

	}

	public void crearDisparo() {
		DisparoThanos disparo = new DisparoThanos(danio, 20, posicionX, posicionY);

	}
}
