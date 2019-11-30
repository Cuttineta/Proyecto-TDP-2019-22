package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Entidad.Entidad;
import Entidad.Personaje;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Fabrica.BotonBomba;
import Fabrica.BotonCampoMuerte;
import Fabrica.BotonCampoProteccion;
import Fabrica.BotonCapAmerica;
import Fabrica.BotonHawkeye;
import Fabrica.BotonHulk;
import Fabrica.BotonIronman;
import Fabrica.BotonParedon;
import Fabrica.BotonStrange;
import Fabrica.BotonThor;
import Hilos.HiloControl;
import Hilos.HiloMovimiento;
import Juego.Juego;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import Mapa.mapa;
import PowerUp.PowerUp;
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
	private boolean vender;

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
	
		juego = Juego.getJuego(this);
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
		
		juego.iniciarHilos();

		repaint();
	}

	public void mostrarGano(int p) {
		JOptionPane.showMessageDialog(null, "Salvaste la galaxia.Tus puntos obtenidos son:"+p);
		System.exit(0);
	}
	
	public void mostrarCambioDeNivel() {
		JOptionPane.showMessageDialog(null, "Cambio de nivel");
	}

	public void mostrarPerdio(int p) {
		JOptionPane.showMessageDialog(null, "Despedite de la mitad de la poblacion...Tus puntos obtenidos son:"+p);
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
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tienda.getEntidadAColocar();
				tienda.getEntidadAColocarAux();
				vender = true;
			}	
		});

		getContentPane().add(panelMapa);
		fondo = new JLabel(new ImageIcon("Sprites/Fondo/asfalto.png"));
		fondo.setBounds(-20, -20, AnchoVentana - 100, AltoVentana);
		panelMapa.add(fondo);
		panelMapa.addMouseListener(new Oyente());
	}

	public void creacionBotones() {
		JButton boton = new BotonHulk(tienda);
		boton.setText("25");
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Hulk/estaticoBoton.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 10, 80, 80);
		panelTienda.add(boton);

		boton = new BotonIronman(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/IronMan/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 80, 80, 80);
		panelTienda.add(boton);

		boton = new BotonHawkeye(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Hawkeye/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 150, 80, 80);
		panelTienda.add(boton);

		boton = new BotonThor(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Thor/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 220, 80, 80);
		panelTienda.add(boton);

		boton = new BotonStrange(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Dr Strange/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 290, 80, 80);
		panelTienda.add(boton);

		boton = new BotonCapAmerica(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Aliados/Cap America/estatico.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 360, 80, 80);
		panelTienda.add(boton);
		
		boton = new BotonBomba(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Objetos/bomba.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 430, 80, 80);
		panelTienda.add(boton);
		
		boton = new BotonParedon(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/Objetos/paredon.png"));
		boton.setFocusable(false);
		boton.setBounds(10, 500, 60, 60);
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
		
			Entidad aColocar = tienda.getEntidadAColocar();
			PowerUp poweraColocar = tienda.getPowerAColocar();
			Entidad aColocarAux = tienda.getEntidadAColocarAux();
			
			if (y != 0 && aColocarAux == null && aColocar == null && poweraColocar != null && !mapa.hayEnPos(x, y , poweraColocar)) {
				System.out.println("pongo el power");
				poweraColocar.setPosicionX(x);
				poweraColocar.setPosicionY(y);
				poweraColocar.setPersonaje(mapa.getPersonajeAliadoEnPos(x,y));
				poweraColocar.agregarALaLista();
				fondo.add(poweraColocar.getGrafico());
				
				repaint();
			}
			
			if (y != 0 && aColocarAux == null && aColocar != null && !mapa.hayEnPos(x, y , aColocar)) {
				tienda.restarMonedas(aColocar.getPrecio());
				actualizarMonedas();
				aColocar.setPosicionX(x);
				aColocar.setPosicionY(y);
				aColocar.agregarALaLista();
				JLabel nuevo = aColocar.getGrafico();
				fondo.add(nuevo);
				repaint();
			}
			
			if (y != 0 && aColocarAux != null && aColocar != null && !mapa.hayEnPos(x, y ,aColocar) && !mapa.hayEnPos(x, y+116) && y<=499) {
				tienda.restarMonedas(aColocar.getPrecio());
				actualizarMonedas();
				aColocar.setPosicionX(x);
				aColocar.setPosicionY(y);
				aColocar.agregarALaLista();;
				aColocarAux.agregarALaLista();
				JLabel nuevo = aColocar.getGrafico();
				fondo.add(nuevo);
				repaint();
			}
			
			if (y != 0 && aColocarAux == null && aColocar == null && vender) {
				vender = false;
				Personaje aVender = mapa.getPersonajeAliadoEnPos(x,y);
				if(aVender != null) {
					tienda.sumarMonedas(aVender.getPrecio());
					aVender.getEstado().cambiarAMuerto();
					actualizarMonedas();
				}
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



	public void CrearBotonMuerte(int x, int y) {
		System.out.println("salio boton m");
		JButton boton = new BotonCampoMuerte(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/PowerUp/campoMuerte.png"));
		boton.setFocusable(false);
		boton.setBounds(x, y, 80, 80);
		fondo.add(boton);
		
	}
	
	public void CrearBotonProteccion(int x, int y) {
		System.out.println("salio boton p");
		JButton boton = new BotonCampoProteccion(tienda);
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setIcon(new ImageIcon("Sprites/PowerUp/campoProteccion.png"));
		boton.setFocusable(false);
		boton.setBounds(x, y, 80, 80);
		fondo.add(boton);
		
	}

}
