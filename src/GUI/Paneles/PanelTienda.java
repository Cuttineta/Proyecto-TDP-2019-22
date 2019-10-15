package GUI.Paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logica.Juego.Juego;
import Logica.Tienda.Tienda;

public class PanelTienda extends JPanel {
	private static final long serialVersionUID = 1L;
	private Tienda tienda;
	private Juego juego;
	private JButton colocables[];
	private String palabras[] = { "Cap America", "Hulk", "Dr Strange", "Hawkeye", "Ironman","Thor" };
	private JLabel fondo;

	public PanelTienda(Tienda t) {
		tienda = t;
		juego = t.getJuego();
		int ancho = juego.getPanelJuego().getAncho();
		int alto = juego.getPanelJuego().getAlto();
		this.setLayout(null);
		this.setBounds(0, 50, ancho - 1100, alto - 50); // El 50 es debido a la altura del PanelStats

		crearBotones();
		fondo = new JLabel();
		fondo.setIcon(new ImageIcon("SpritesAvengers/Fondo/Metal.png"));
		fondo.setBounds(0, 0, ancho-1100, alto-60);
		this.add(fondo);
	}

	public void crearBotones() {
		colocables = new JButton[palabras.length];
		OyenteB oyente = new OyenteB();
		for (int i = 0; i < palabras.length; i++) {
			crearBoton(i, oyente);
		}
	}

	private void crearBoton(int i, OyenteB oyente) {
		colocables[i] = new JButton();
		colocables[i].setBorder(null);
		colocables[i].setBorderPainted(false);
		colocables[i].setContentAreaFilled(false);
		colocables[i].setActionCommand(palabras[i]);
		colocables[i].setIcon(new ImageIcon("SpritesAvengers/Aliados/" + palabras[i] + "/estatico.png"));
		colocables[i].setFocusable(false);
		colocables[i].setBounds(15,100*i , 70, 70);
		colocables[i].addActionListener(oyente);
		this.add(colocables[i]);
	}

	

	public Tienda getTienda() {
		return tienda;
	}

	private class OyenteB implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			switch (s) {
			case ("Cap America"): {
				if (tienda.getJuego().getMapa().hayEntidades()) {
					tienda.getJuego().getMapa().getEntidad().getGrafico().atacar();
				}

				tienda.setPersonajeActual(tienda.getFabrica().crearCapAmerica(juego.getMapa()));
				break;
			}
			case ("Hulk"): {
				if (tienda.getJuego().getMapa().hayEntidades()) {
					tienda.getJuego().getMapa().getEntidad().getGrafico().atacar();
				}

				tienda.setPersonajeActual(tienda.getFabrica().crearHulk(juego.getMapa()));
				break;
			}
			case ("Dr Strange"): {
				if (tienda.getJuego().getMapa().hayEntidades()) {
					tienda.getJuego().getMapa().getEntidad().getGrafico().atacar();
				}

				tienda.setPersonajeActual(tienda.getFabrica().crearDrStrange(juego.getMapa()));
				break;
			}
			case ("Hawkeye"): {
				if (tienda.getJuego().getMapa().hayEntidades()) {
					tienda.getJuego().getMapa().getEntidad().getGrafico().atacar();
				}

				tienda.setPersonajeActual(tienda.getFabrica().crearHawkeye(juego.getMapa()));
				break;
			}
			case ("Ironman"): {
				if (tienda.getJuego().getMapa().hayEntidades()) {
					tienda.getJuego().getMapa().getEntidad().getGrafico().atacar();
				}

				tienda.setPersonajeActual(tienda.getFabrica().crearIronman(juego.getMapa()));
				break;
			}
			case ("Thor"): {
				if (tienda.getJuego().getMapa().hayEntidades()) {
					tienda.getJuego().getMapa().getEntidad().getGrafico().atacar();
				}

				tienda.setPersonajeActual(tienda.getFabrica().crearThor(juego.getMapa()));
				break;
			}

			}

		}

	}

}
