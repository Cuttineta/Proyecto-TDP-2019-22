package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoEnemigo.DisparoNebula;
import Disparo.DisparoEnemigo.DisparoThanos;
import Estado.Atacando;
import Estado.Caminando;
import Visitor.Visitor;

public class Thanos extends Enemigo {

	public Thanos() {
		vida = 15;
		danio = 5;
		recompensaMonedas = 10;
		recompensaPuntos = 15;
		velocidad = 3;
		velocidadInicial = 3;
		estatico = new ImageIcon("Sprites/Enemigos/Thanos/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Thanos/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	

	public void crearDisparo() {
		DisparoThanos disparo = new DisparoThanos(danio, 30, posicionX, posicionY);

	}
}
