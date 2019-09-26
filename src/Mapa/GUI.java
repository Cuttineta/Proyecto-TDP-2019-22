package Mapa;

import Splash_Screen.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame implements Runnable {

	public Juego j;
	private Tienda tienda;
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 950;
	private static final int ALTO = 700;
	private JLabel fondo;
	private JPanel contentPane;
	private static Thread thread;

	public GUI() {
		j = new Juego(this);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, ANCHO, ALTO);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		agregarDibujo();
		tienda = new Tienda(this);
	}

	public static final void main(String args[]) {
		Generador_Splash sp = new Generador_Splash();
		sp.cargarSplash();

		GUI gui = new GUI();
		gui.setVisible(true);
		gui.setResizable(false);
		gui.setLocationRelativeTo(null);
		gui.start();
	}

	private void agregarDibujo() {

		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Fondo/asfalto2.png"));

		fondo = new JLabel(imagen);

		fondo.setBounds(-10, 31, ANCHO, ALTO);

		getContentPane().add(fondo);

	}

	private void start() {
		thread = new Thread();
		thread.start();
	}

	private void finish() {
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
	}

}