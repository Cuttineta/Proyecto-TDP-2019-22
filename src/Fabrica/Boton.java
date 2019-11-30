package Fabrica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import Entidad.Entidad;
import Entidad.Aliados.Aliado;
import Tienda.tienda;

public abstract class Boton extends JButton {

	private static final long serialVersionUID = 1L;
	
	public Boton(tienda t) {		
		addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Entidad entidad = crearEntidad();
			t.setEntidadAColocar(entidad);
		}	
	});
	}
	
	public abstract Entidad crearEntidad();
}
