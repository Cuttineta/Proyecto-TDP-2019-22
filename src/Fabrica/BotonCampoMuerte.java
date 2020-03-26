package Fabrica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import PowerUp.CampoDeMuerte;
import PowerUp.PowerUp;
import Tienda.tienda;

@SuppressWarnings("serial")
public class BotonCampoMuerte extends JButton {

	protected tienda tienda;

	public BotonCampoMuerte(tienda t) {
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PowerUp power = crearPower();
				t.setPowerAColocar(power);
			}
		});
	}

	public PowerUp crearPower() {
		this.setVisible(false);
		return new CampoDeMuerte();
	}

}
