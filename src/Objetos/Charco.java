package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class Charco extends ObjetoTiempo {

	public Charco() {
		tiempoDeVida = 150;
		estatico = new ImageIcon("Sprites/Objetos/charco.png");

		grafico = new JLabel();
		grafico.setIcon(estatico);
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitar(this);

	}
 
}
