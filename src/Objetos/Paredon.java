package Objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoEnemigo.DisparoEnemigo;
import Estado.Caminando;
import Mapa.mapa;
import Visitor.Visitor;

public class Paredon extends ObjetoVida {
	
	public Paredon() {
		
		vida = 45;
		precio = 50;
	
		estatico = new ImageIcon("Sprites/Objetos/paredon.png");
		
		grafico = new JLabel();
		grafico.setIcon(estatico);
		
	}
	@Override
	
	public void setVida(int i) {
		this.vida = i;
		if(vida <= 0) {
			eliminarDeLaLista();
			this.grafico.setVisible(false);
		}
	}

	 
}
