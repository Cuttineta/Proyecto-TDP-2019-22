package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoAliado.DisparoCapAmerica;
import Estado.Caminando;
import Visitor.Visitor;

public class CapAmerica extends Aliado {

	public CapAmerica() {
		rango = 1;
		vidaInicial = 25;
		vida = vidaInicial;
		precio = 25;
		danio = 0;
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
	public void aceptarVisitor(Visitor v) {
		v.visitar(this);
	}

}
