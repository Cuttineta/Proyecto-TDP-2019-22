package PowerUp;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Entidad.Entidad;
import Entidad.Personaje;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Mapa.mapa;
import Objetos.Objeto;
import Visitor.Visitor;
import Visitor.VisitorBomba;

public class CampoDeMuerte extends PowerUp {

	public CampoDeMuerte() {
		visitor = new VisitorBomba();
		estatico = new ImageIcon("Sprites/PowerUp/campoMuerte.png");
		grafico = new JLabel();
		grafico.setIcon(estatico);

	}

	@Override
	public void actuar() {
		for (Aliado aliado : mapa.getMapa().getAliados()) {

			if (aliado != personaje && this.getPosicionY() == aliado.getPosicionY() && this.getPosicionX() - aliado.getPosicionX() <= 50
					
					&& this.getPosicionX() - aliado.getPosicionX() >= 35) {
				aliado.aceptarVisitor(visitor);
				eliminarDeLaLista();
				getGrafico().setVisible(false);

			}

		} 
		for (Enemigo enemigo : mapa.getMapa().getEnemigos()) {

			if (enemigo != personaje && this.getPosicionY() == enemigo.getPosicionY() && enemigo.getPosicionX() - this.getPosicionX() <= 50
					&& enemigo.getPosicionX() - this.getPosicionX() >= 35) {
				enemigo.aceptarVisitor(visitor);
				eliminarDeLaLista();
				getGrafico().setVisible(false);

			}

		}
		if (personaje != null) {
			setPosicionY(personaje.getPosicionY());
			setPosicionX(personaje.getPosicionX());
		}
		
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitar(this);

	}

}
