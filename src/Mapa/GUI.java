package Mapa;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
<<<<<<< HEAD
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.util.List;
=======
>>>>>>> parent of 57c56d3... new background system

public class GUI extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;

	private static final int ANCHO = 800;
	private static final int ALTO = 700;

	private JLabel fondo;
	private JPanel contentPane;
	private static Thread thread;
	private JButton btnSalir;
	private JLabel lblMonedas;

	public GUI() {

<<<<<<< HEAD
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
			public void keyReleased(KeyEvent arg0) {
				
			
			}
		});
=======
>>>>>>> parent of 57c56d3... new background system
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, ANCHO, ALTO);
		contentPane = new JPanel();
		// contentPane.setBorder(null);
<<<<<<< HEAD
		setContentPane(contentPane);
		contentPane.setLayout(null);
		agregarDibujo();
	}

	public static final void main(String args[]) {
		GUI gui = new GUI();
		gui.setVisible(true);
		gui.setResizable(false);
		gui.start();
	}

	private void agregarDibujo() {

		ImageIcon imagen = new ImageIcon("C:\\Users\\Lautaro\\Documents\\GitHub\\Proyecto-TDP-2019-22\\src\\Imagenes\\Sprites\\FondoMapa\\asfalto good.png");
		fondo = new JLabel(imagen);

		fondo.setBounds(0, 35, ANCHO, ALTO);

		getContentPane().add(fondo);
		setBounds(0, 0, 1980, 1040);
	
		contentPane = new JPanelConFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JButton btnPausa = new JButton("Pausa");
		btnPausa.setBounds(685, 0, 89, 23);
		contentPane.add(btnPausa);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(685, 39, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblPuntaje.setBounds(546, 4, 57, 28);
		contentPane.add(lblPuntaje);

		lblMonedas = new JLabel("MONEDAS: ");
		lblMonedas.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblMonedas.setBounds(546, 35, 73, 27);
		contentPane.add(lblMonedas);
	}

	private synchronized void start() {
		thread = new Thread(this);
		thread.start();
	}

	private synchronized void finish() {
		try {
			thread.join();
		} catch (InterruptedException e) {
		}
	}

	private void refresh() {
	}

	private void showToScreen() {

	}

	@Override
	public void run() {
			System.nanoTime();
			while (true) {
				refresh();
				showToScreen();
			}
	}
}
		contentPane.setLayout(null);
		
=======
>>>>>>> parent of 57c56d3... new background system
		setContentPane(contentPane);
		contentPane.setLayout(null);
		agregarDibujo();
	}

	public static final void main(String args[]) {
		GUI gui = new GUI();
		gui.setVisible(true);
		gui.setResizable(false);
		gui.start();
	}

	private void agregarDibujo() {

		ImageIcon imagen = new ImageIcon("C:\\Users\\Lautaro\\Documents\\GitHub\\Proyecto-TDP-2019-22\\src\\Imagenes\\Sprites\\FondoMapa\\asfalto good.png");
		fondo = new JLabel(imagen);

		fondo.setBounds(0, 35, ANCHO, ALTO);

		getContentPane().add(fondo);

		JButton btnPausa = new JButton("Pausa");
		btnPausa.setBounds(685, 0, 89, 23);
		contentPane.add(btnPausa);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(685, 39, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblPuntaje.setBounds(546, 4, 57, 28);
		contentPane.add(lblPuntaje);

		lblMonedas = new JLabel("MONEDAS: ");
		lblMonedas.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblMonedas.setBounds(546, 35, 73, 27);
		contentPane.add(lblMonedas);
	}

	private synchronized void start() {
		thread = new Thread(this);
		thread.start();
	}

	private synchronized void finish() {
		try {
			thread.join();
		} catch (InterruptedException e) {
		}
	}

	private void refresh() {
	}

	private void showToScreen() {

	}

	@Override
	public void run() {
			System.nanoTime();
			while (true) {
				refresh();
				showToScreen();
			}
	}
}
