package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoCapAmerica;
import Disparo.DisparoIronman;
import Estado.Caminando;
import Visitor.Visitor;

public class CapAmerica extends Aliado {

	public CapAmerica() {
		rango = 1;
		vida = 80;
		precio = 25;
		danio = 30;
		estatico = new ImageIcon("Sprites/Aliados/Cap America/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Cap America/estatico.png");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();

	}
	
	public void crearDisparo() {
		DisparoCapAmerica disparo = new DisparoCapAmerica(danio, rango, posicionX, posicionY);
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarCapAmerica(this);		
	}

}
