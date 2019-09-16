package Mapa;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

public class GUI extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 950;
	private static final int ALTO = 700;
	private JLabel fondo;
	private JLabel fondoTienda;
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
		gui.setLocationRelativeTo(null);
		gui.start();
	}

	private void agregarDibujo() {

		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Fondo/asfalto2.png"));
		fondo = new JLabel(imagen);

		fondo.setBounds(0, 35, ANCHO, ALTO);

		getContentPane().add(fondo);
		
		
		ImageIcon tienda = new ImageIcon(this.getClass().getResource("/Imagenes/Fondo/metal.jpg"));
		fondoTienda = new JLabel(tienda);
		
		fondoTienda.setBounds(0,0,500, ALTO);
		getContentPane().add(fondoTienda);

		JButton btnPausa = new JButton("Pausa");
		btnPausa.setBounds(804, 1, 89, 23);
		contentPane.add(btnPausa);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(804, 34, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblPuntaje.setBounds(646, -3, 57, 28);
		contentPane.add(lblPuntaje);

		lblMonedas = new JLabel("MONEDAS: ");
		lblMonedas.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblMonedas.setBounds(646, 31, 73, 27);
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
