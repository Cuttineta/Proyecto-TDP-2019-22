package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoEnemigo.DisparoSurtur;
import Estado.Caminando;

public class Surtur extends Enemigo {

	public Surtur() {
		vida = 12;
		danio = 4;
		recompensaMonedas = 10;
		recompensaPuntos = 9;
		velocidad = 3;
		velocidadInicial = 3;
		estatico = new ImageIcon("Sprites/Enemigos/Surtur/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Surtur/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	public void crearDisparo() {
		DisparoSurtur disparo = new DisparoSurtur(danio, 30, posicionX, posicionY);

	}
}
