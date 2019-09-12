package Mapa;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.util.List;

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
		gui.setResizable(true);
		gui.start();
	}

	private void agregarDibujo() {

		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Fondo/asfalto.jpg"));
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
		lblPuntaje.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblPuntaje.setBounds(536, 4, 57, 28);
		contentPane.add(lblPuntaje);

		lblMonedas = new JLabel("MONEDAS: ");
		lblMonedas.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblMonedas.setBounds(536, 35, 73, 27);
		contentPane.add(lblMonedas);
	}

	private void start() {
		thread = new Thread(this);
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
		System.nanoTime();
		while (true) {
			refresh();
			showToScreen();
		}
	}
}
