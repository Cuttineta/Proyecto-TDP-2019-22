package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoEnemigo.DisparoYondu;
import Estado.Caminando;

public class Yondu extends Enemigo {

	public Yondu() {
		vida = 6;
		this.danio = 2;
		recompensaMonedas = 10;
		recompensaPuntos = 7;
		velocidad = 2;
		velocidadInicial = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Yondu/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Yondu/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	public void crearDisparo() {
		DisparoYondu disparo = new DisparoYondu(danio, 30, posicionX, posicionY);

	}
}
