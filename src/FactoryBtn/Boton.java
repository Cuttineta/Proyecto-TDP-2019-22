package FactoryBtn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Entidad.Personaje;
import Game.Tienda;

public abstract class Boton extends JButton {

	private static final long serialVersionUID = 1L;

	protected Tienda t;

	protected Boton() {

		new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Personaje p = crear();
				t.setToAdd(p);
			}
		};

	}

	public abstract Personaje crear();

}
