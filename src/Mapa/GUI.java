package Mapa;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class GUI extends JFrame implements Runnable {

	private Juego j;
	private Tienda tienda;
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 950;
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

		setContentPane(contentPane);
		contentPane.setLayout(null);
		agregarDibujo();
		tienda = new Tienda(this);

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

		JButton btnPausa = new JButton("Pausa");
		btnPausa.setBounds(804, 1, 89, 23);
		contentPane.add(btnPausa);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(804, 34, 89, 23);
		contentPane.add(btnSalir);


		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});


		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblPuntaje.setBounds(674, 1, 57, 28);
		contentPane.add(lblPuntaje);

		lblMonedas = new JLabel("MONEDAS: ");
		lblMonedas.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblMonedas.setBounds(674, 31, 73, 27);
		contentPane.add(lblMonedas);


		btnIronMan = new JButton();


		btnHawkeye = new JButton();
		
		
	
			


		btnIronMan.setBackground(new Color(0, 0, 0, 0));

		btnIronMan.setBackground(Color.LIGHT_GRAY);

		btnIronMan.setOpaque(true);
		btnIronMan.setBounds(10, 1, 73, 81);
		btnIronMan.setIcon(new ImageIcon(GUI.class.getResource("/Imagenes/Sprites/Aliados/IronMan/estatico.png")));

		contentPane.add(btnIronMan);
		

		btnHawkeye = new JButton();
		btnHawkeye.setBounds(93, 1, 73, 81);
		btnHawkeye.setOpaque(true);

		btnHawkeye.setBackground(new Color(0, 0, 0, 0));
		btnHawkeye
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hawkeye/estatico.png")));

		btnHawkeye.setIcon(new ImageIcon(GUI.class.getResource("/Imagenes/Sprites/Aliados/Hawkeye/estatico.png")));
		contentPane.add(btnHawkeye);

		btnHulk = new JButton();
		btnHulk.setOpaque(true);
		btnHulk.setBackground(new Color(0, 0, 0, 0));
		btnHulk.setBounds(175, 1, 73, 81);
		btnHulk.setIcon(new ImageIcon(GUI.class.getResource("/Imagenes/Sprites/Aliados/Hulk/h estatico.png")));
		contentPane.add(btnHulk);

		btnCapAmerica = new JButton();
		btnCapAmerica.setBackground(new Color(0, 0, 0, 0));
		btnCapAmerica.setOpaque(true);
		btnCapAmerica.setBounds(260, 1, 73, 81);

		btnCapAmerica.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Cap America/estatico.png")));

		btnCapAmerica.setBackground(Color.LIGHT_GRAY);
		btnCapAmerica.setIcon(new ImageIcon(GUI.class.getResource("/Imagenes/Sprites/Aliados/Cap America/estatico.png")));

		contentPane.add(btnCapAmerica);

		btnStrange = new JButton();
		btnStrange.setBackground(new Color(0, 0, 0, 0));
		btnStrange.setOpaque(true);
		btnStrange.setBounds(350, 1, 73, 81);
		btnStrange.setIcon(new ImageIcon(GUI.class.getResource("/Imagenes/Sprites/Aliados/Dr Strange/tienda.png")));
		contentPane.add(btnStrange);

		btnThor = new JButton();
		btnThor.setBackground(new Color(0, 0, 0, 0));
		btnThor.setOpaque(true);
		btnThor.setBounds(440, 1, 73, 81);
		btnThor.setIcon(new ImageIcon(GUI.class.getResource("/Imagenes/Sprites/Aliados/Thor/estatico.png")));
		contentPane.add(btnThor);


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
		// TODO Auto-generated method stub

	}

}