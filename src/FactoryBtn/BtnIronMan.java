package FactoryBtn;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BtnIronMan implements FabricaAbstractaBoton {

	@Override
	public Boton crearBoton() {
		JButton b = new Boton();
		b.setBackground(Color.LIGHT_GRAY);
		b.setOpaque(true);
		b.setBounds(10, 10, 73, 81);
		b.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/IronMan/estatico.png")));

		return b;
	}

}
