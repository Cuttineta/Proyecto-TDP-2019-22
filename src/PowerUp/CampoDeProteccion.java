package PowerUp;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Visitor.Visitor;

public class CampoDeProteccion extends PowerUp {
	protected int tiempoDeProteccion;

	public CampoDeProteccion() {
		tiempoDeProteccion = 200;
		estatico = new ImageIcon("Sprites/PowerUp/campoProteccion.png");
		grafico = new JLabel();
		grafico.setBounds(0, 0, 80, 80);
		grafico.setIcon(estatico);

	}

	@Override
	public void actuar() {
		if (personaje != null) {
			setPosicionY(personaje.getPosicionY());
			setPosicionX(personaje.getPosicionX());
		}
		tiempoDeProteccion--;
		if (tiempoDeProteccion <= 0) {
			eliminarDeLaLista();
			grafico.setVisible(false);
		}

	}

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitar(this);
		eliminarDeLaLista();
		grafico.setVisible(false);

	}

}
