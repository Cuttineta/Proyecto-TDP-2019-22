package Mapa;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;

	private static final int ANCHO = 800;
	private static final int ALTO = 700;

	private JLabel fondo;
	private JPanel contentPane;
	private static Thread thread;
	private static volatile boolean funcionamiento = false;

	public GUI() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, ANCHO, ALTO);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		ImageIcon imagen = new ImageIcon(this.getClass().getResource("/imagenes/Sprites/asfalto good.png"));
		fondo = new JLabel(imagen);

		fondo.setBounds(0, 0, ANCHO, ALTO);

		this.add(fondo);
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
		while (funcionamiento) {
			System.nanoTime();
			while (true) {
				refresh();
				showToScreen();
			}
		}
	}
}
