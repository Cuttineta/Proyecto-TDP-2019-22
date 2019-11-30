package Fabrica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Entidad.Entidad;
import PowerUp.CampoDeMuerte;
import PowerUp.CampoDeProteccion;
import PowerUp.PowerUp;
import Tienda.tienda;

public class BotonCampoProteccion extends JButton{
	protected tienda tienda;
	public BotonCampoProteccion(tienda t) {
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PowerUp power = crearPower();
				t.setPowerAColocar(power);
			}	
		});
	}

	public PowerUp crearPower() {
		this.setVisible(false);
		return new CampoDeProteccion();
	}

}
