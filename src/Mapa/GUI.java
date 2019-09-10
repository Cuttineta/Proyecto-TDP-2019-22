package Mapa;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GUI extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;

	private static final int ANCHO = 1024;
	private static final int ALTO = 700;

	private static JFrame ventana;
	private static Thread thread;

	private GUI() {
		setPreferredSize(new Dimension(ANCHO, ALTO));
		ventana = new JFrame("Juego");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setLayout(new BorderLayout());
		ventana.add(this, BorderLayout.CENTER);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static final void main(String args[]) {
		GUI gui = new GUI();
		gui.start();
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
		while(true) {
			refresh();
			showToScreen();
		}
	}

}
