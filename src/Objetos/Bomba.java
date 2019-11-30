package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Mapa.mapa;
import Visitor.Visitor;
import Visitor.VisitorBomba;

public class Bomba extends ObjetoTiempo {

	public Bomba() {
		tiempoDeVida = 20;
		visitor = new VisitorBomba();
		precio = 50;
        estatico = new ImageIcon("Sprites/Objetos/bomba.png");
		grafico = new JLabel();
		grafico.setIcon(estatico);
	}

	public void aceptarVisitor(Visitor v) {
	}

	public void actuar() {
		tiempoDeVida--;
		if (tiempoDeVida == 0) {
			for (Aliado aliado : mapa.getMapa().getAliados()) {
				if ((aliado.getPosicionY() == this.getPosicionY() || aliado.getPosicionY() == this.getPosicionY() + 116
						|| aliado.getPosicionY() == this.getPosicionY() - 116)
						&& this.getPosicionX() - aliado.getPosicionX() <= 150
						&& this.getPosicionX() - aliado.getPosicionX() >= -150) {
					aliado.aceptarVisitor(visitor);
					eliminarDeLaLista();
					getGrafico().setVisible(false);
				}
			}
			
			for (Enemigo enemigo: mapa.getMapa().getEnemigos()) {
				if ((enemigo.getPosicionY() == this.getPosicionY() || enemigo.getPosicionY() == this.getPosicionY() + 116
						|| enemigo.getPosicionY() == this.getPosicionY() - 116)
						&& this.getPosicionX() - enemigo.getPosicionX() <= 150
						&& this.getPosicionX() - enemigo.getPosicionX() >= -150) {
					enemigo.aceptarVisitor(visitor);
					eliminarDeLaLista();
					getGrafico().setVisible(false);
				}
			}
			
			
					eliminarDeLaLista();
				this.grafico.setVisible(false);
			

		}
	}

}
