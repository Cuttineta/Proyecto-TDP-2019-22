package Entidad.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoNebula;
import Disparo.DisparoYondu;
import Estado.Caminando;
import Visitor.Visitor;

public class Yondu extends Enemigo {

	public Yondu() {
		vida = 6;
		danio = 30;
		recompensa = 10;
		velocidad = 2;
		estatico = new ImageIcon("Sprites/Enemigos/Yondu/estatico.png");
		atacando = new ImageIcon("Sprites/Enemigos/Yondu/atacando.gif");	
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
		}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarYondu(this);		
	}
	
	public void crearDisparo() {
		DisparoYondu disparo = new DisparoYondu(danio, 20, posicionX, posicionY);
		
	}
}
