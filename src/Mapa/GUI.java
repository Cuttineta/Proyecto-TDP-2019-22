package Mapa;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

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

		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, ANCHO, ALTO);
		contentPane = new JPanel();
		// contentPane.setBorder(null);
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

<<<<<<< HEAD

		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/im�genes/Sprites/asfalto good.png"));
=======
		ImageIcon imagen = new ImageIcon("Imagenes/Sprites/FondoMapa/asfalto good.png");
>>>>>>> 408339d7dbc0e006d7d709888ac8a67b9de8ec23
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
