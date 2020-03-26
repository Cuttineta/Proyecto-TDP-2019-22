package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoAliado.DisparoIronman;
import Estado.Caminando;

public class Ironman extends Aliado {

	public Ironman() {
		rango = 300;
		vidaInicial = 10;
		vida = vidaInicial;
		precio = 25;
		this.danio = 3;
		estatico = new ImageIcon("Sprites/Aliados/Ironman/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Ironman/atacando.gif");
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
	}

	public void crearDisparo() {
		DisparoIronman disparo = new DisparoIronman(danio, rango, posicionX, posicionY);

	}

}
