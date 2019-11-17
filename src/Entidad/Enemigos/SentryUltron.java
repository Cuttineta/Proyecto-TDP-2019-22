package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoNebula;
import Disparo.DisparoSentryUltron;
import Estado.Caminando;
import Visitor.Visitor;

public class SentryUltron extends Enemigo {

	public SentryUltron() {
		vida = 9;
		danio = 40;
		recompensa = 10;
		velocidad = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Sentry Ultron/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Sentry Ultron/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarSentryUltron(this);		
	}
	
	public void crearDisparo() {
		DisparoSentryUltron disparo = new DisparoSentryUltron(danio, 20, posicionX, posicionY);
		
	}
}
