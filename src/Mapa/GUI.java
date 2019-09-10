package Mapa;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	private static final int ANCHO = 1024;
	private static final int ALTO = 700;

	private static JFrame ventana;
	private static Thread thread;
	private JLabel fondo;
	private static volatile boolean funcionamiento = false;

	private GUI() {
		setBounds(0, 0, 1024, 700);
		setPreferredSize(new Dimension(ANCHO, ALTO));
		ventana = new JFrame("Juego");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.getContentPane().setLayout(new BorderLayout());
		ventana.getContentPane().add(this);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		/*
		 * fondo.setIcon(new ImageIcon("imágenes\\Sprites\\asfalto good.png"));
		 * fondo.setPreferredSize(new Dimension(ANCHO, ALTO - 100));
		 * ventana.getContentPane().add(fondo);
		 */

	}

	public static final void main(String args[]) {
		GUI gui = new GUI();
		gui.start();
	}

	private synchronized void start() {
		funcionamiento = true;
		thread = new Thread(this);
		thread.start();
	}

	private synchronized void finish() {
		funcionamiento = false;
	}

	@Override
	public void run() {
		while (funcionamiento) {

		}
	}

}
