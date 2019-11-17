package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoDrStrange;
import Disparo.DisparoThor;
import Estado.Caminando;
import Visitor.Visitor;

public class Thor extends Aliado {

	public Thor() {
		rango = 1;
		vida = 80;
		precio = 25;
		danio = 30;
		estatico = new ImageIcon("Sprites/Aliados/Thor/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Thor/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	@Override
	public void aceptarDisparo(Disparo v) {
		v.visitarThor(this);		
	}

	public void crearDisparo() {
		DisparoThor disparo = new DisparoThor(danio, rango, posicionX, posicionY);
		
	}
}
