package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoEnemigo.DisparoUltron;
import Estado.Caminando;

public class Ultron extends Enemigo {

	public Ultron() {
		vida = 3;
		danio = 4;
		recompensaMonedas = 10;
		recompensaPuntos = 7;
		velocidad = 2;
		velocidadInicial = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Ultron/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Ultron/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	public void crearDisparo() {
		DisparoUltron disparo = new DisparoUltron(danio, 30, posicionX, posicionY);

	}
}
