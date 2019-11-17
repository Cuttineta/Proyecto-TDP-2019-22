package GUI;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Fabrica.BotonCapAmerica;
import Fabrica.BotonHawkeye;
import Fabrica.BotonHulk;
import Fabrica.BotonIronman;
import Fabrica.BotonStrange;
import Fabrica.BotonThor;
import Hilos.HiloControl;
import Hilos.HiloMovimiento;
import Juego.Juego;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import Mapa.mapa;
import Tienda.tienda;
import java.awt.Font;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int AnchoVentana = 1200;
	private static final int AltoVentana = 740;
	private static JLabel fondo, monedas;
	private JPanel panelTienda, panelMapa;
	private mapa mapa;
	private tienda tienda;
	private Juego juego;

	// ---------------------------------------------

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static JLabel getFondo() {
		return fondo;
	}

	public Ventana() {
		super("Avengers");
		juego = new Juego(this);

		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, AnchoVentana, AltoVentana);
		getContentPane().setLayout(null);

		panelTienda = new JPanel();
		panelTienda.setLayout(null);
		panelTienda.setBounds(0, 0, 100, AltoVentana);
		getContentPane().add(panelTienda);

		panelMapa = new JPanel();
		panelMapa.setLayout(null);
		panelMapa.setBounds(100, 0, AnchoVentana - 100, AltoVentana);
		tienda = juego.getTienda();
		mapa = juego.getMapa();
		creacionBotones();
		creacionPaneles(); // Creacion de panelMapa y panelTienda
		juego = new Juego(this);
		juego.iniciarHilos();

		repaint();
	}

	public void mostrarGano() {
		JOptionPane.showMessageDialog(null, "Salvaste la galaxia.");
		juego.siguienteNivel();
	}

	public void mostrarPerdio() {
		JOptionPane.showMessageDialog(null, "Despedite de la mitad de la población...");
		System.exit(0);
	}

	public void creacionPaneles() {

		fondo = new JLabel(new ImageIcon("Sprites/Fondo/metal.png"));
		fondo.setBounds(0, 0, 100, AltoVentana);
		panelTienda.add(fondo);

		JLabel monedasImg = new JLabel(new ImageIcon("Sprites/gemas.png"));
		monedasImg.setBounds(35, AltoVentana - 180, 40, 26);
		fondo.add(monedasImg);

		monedas = new JLabel();
		monedas.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		actualizarMonedas();
		monedas.setBounds(40, AltoVentana - 150, 40, 20);
		fondo.add(monedas);

		JButton btnVender = new JButton("Vender");
		btnVender.setBounds(05, AltoVentana - 100, 90, 30);
		fondo.add(btnVender);

		getContentPane().add(panelMapa);
		fondo = new JLabel(new ImageIcon("Sprites/Fondo/asfalto.png"));
		fondo.setBounds(-20, -20, AnchoVentana - 100, AltoVentana);
		panelMapa.add(fondo);
		panelMapa.addMouseListener(new Oyente());
	}

	public void creacionBotones() {
		JButton boton = new BotonHulk(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Hulk/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 10, 80, 80);
		panelTienda.add(boton);

		boton = new BotonIronman(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/IronMan/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 100, 80, 80);
		panelTienda.add(boton);

		boton = new BotonHawkeye(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Hawkeye/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 190, 80, 80);
		panelTienda.add(boton);

		boton = new BotonThor(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Thor/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 280, 80, 80);
		panelTienda.add(boton);

		boton = new BotonStrange(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Dr Strange/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 370, 80, 80);
		panelTienda.add(boton);

		boton = new BotonCapAmerica(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Cap America/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 460, 80, 80);
		panelTienda.add(boton);

	}

	public void agregarEnemigo(JLabel l) {
		if (l != null)
			fondo.add(l);

	}

	public void actualizarMonedas() {
		monedas.setText("" + tienda.getMonedas());
	}

	private class Oyente implements MouseListener {

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();

			x = (x / 110) * 110 + 25; // Lo posiciona en el eje x
			y = (y / 116) * 116 + 35;// Lo posiciona en el eje y
			Aliado aColocar = tienda.getPersonajeAColocar();
			if (y != 0 && aColocar != null && !mapa.hayEnPos(x, y)) {
				actualizarMonedas();
				aColocar.setPosicionX(x);
				aColocar.setPosicionY(y);
				mapa.agregarAliado(aColocar);
				JLabel nuevo = aColocar.getGrafico();
				fondo.add(nuevo);
				repaint();
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
