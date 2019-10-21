package Boton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Aliados.Aliado;
import Logica.Mapa.Mapa;

public abstract class BotonAliado extends JButton{
	 
	public abstract Aliado crearPersonaje(Mapa m);
	
	class OyenteBotonALiado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Aliado a = crearPersonaje();
		}
		
	}
}
