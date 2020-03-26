package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoAliado.DisparoThor;
import Estado.Caminando;

public class Thor extends Aliado {

	public Thor() {
		rango = 1;
		vidaInicial = 12;
		vida = vidaInicial;
		precio = 25;
		danio = 2;
		estatico = new ImageIcon("Sprites/Aliados/Thor/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Thor/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	public void crearDisparo() {
		DisparoThor disparo = new DisparoThor(danio, rango, posicionX, posicionY);

	}
}
