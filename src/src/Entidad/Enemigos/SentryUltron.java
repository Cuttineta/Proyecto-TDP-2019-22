package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoEnemigo.DisparoNebula;
import Disparo.DisparoEnemigo.DisparoSentryUltron;
import Estado.Caminando;
import Visitor.Visitor;

public class SentryUltron extends Enemigo {

	public SentryUltron() {
		vida = 9;
		danio = 3;
		recompensaMonedas = 10;
		recompensaPuntos = 6;
		velocidad = 2;
		velocidadInicial = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Sentry Ultron/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Sentry Ultron/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	
	
	public void crearDisparo() {
		DisparoSentryUltron disparo = new DisparoSentryUltron(danio, 30, posicionX, posicionY);
		
	}
}
