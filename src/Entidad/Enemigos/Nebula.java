package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoEnemigo.DisparoNebula;
import Estado.Caminando;
import Visitor.Visitor;

public class Nebula extends Enemigo {

	public Nebula() {
		vida = 15;
		danio = 3;
		recompensaMonedas = 10;
		recompensaPuntos = 10;
		velocidad = 2;
		velocidadInicial = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Nebula/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Nebula/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitar(this);

	}

	public void crearDisparo() {
		DisparoNebula disparo = new DisparoNebula(danio, 30, posicionX, posicionY);

	}

}
