package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.Disparo;
import Disparo.DisparoDrStrange;
import Disparo.DisparoHulk;
import Estado.Caminando;
import Visitor.Visitor;

public class Hulk extends Aliado{

	public Hulk() {
		rango = 25;
		vida = 300;
		precio = 20;
		danio = 4;
		estatico = new ImageIcon("Sprites/Aliados/Hulk/estatico.png");
		atacando = new ImageIcon("Sprites/Aliados/Hulk/atacando.gif");	
		grafico = new JLabel();
		estado = new Caminando(this);
		estado.actuar();
		}
	
	public void crearDisparo() {
		DisparoHulk disparo = new DisparoHulk(danio, rango, posicionX, posicionY);
		
	}
	
	public void aceptarDisparo(Disparo v) {
		v.visitarHulk(this);
	}
}
