package Mapa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tienda extends JPanel {

	private static final long serialVersionUID = 1L;

	private ImageIcon imgTienda = new ImageIcon(this.getClass().getResource("/Imagenes/Fondo/metal.png"));
	private JButton btnIronMan, btnHawkeye, btnCapAmerica, btnHulk, btnThor, btnStrange;
	private GUI g;

	public Tienda(GUI graf) {
		this.g = graf;

		JLabel fondoTienda = new JLabel(imgTienda);
		agregarBotones();
		fondoTienda.setBounds(-30, 1, 703, 98);
		g.getContentPane().add(fondoTienda);

	}

	private void agregarBotones() {
		btnIronMan = new JButton();
		btnIronMan.setBackground(Color.LIGHT_GRAY);
		btnIronMan.setOpaque(true);
		btnIronMan.setBounds(10, 10, 73, 81);
		btnIronMan
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/IronMan/estatico.png")));
		g.getContentPane().add(btnIronMan);

		btnHawkeye = new JButton();
		btnHawkeye.setBounds(93, 10, 73, 81);
		btnHawkeye.setOpaque(true);
		btnHawkeye.setBackground(Color.LIGHT_GRAY);
		btnHawkeye
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hawkeye/estatico.png")));
		g.getContentPane().add(btnHawkeye);

		btnHulk = new JButton();
		btnHulk.setOpaque(true);
		btnHulk.setBackground(Color.LIGHT_GRAY);
		btnHulk.setBounds(175, 10, 73, 81);
		btnHulk.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hulk/h estatico.png")));
		g.getContentPane().add(btnHulk);

		btnCapAmerica = new JButton();
		btnCapAmerica.setOpaque(true);
		btnCapAmerica.setBounds(260, 10, 73, 81);
		btnCapAmerica.setBackground(Color.LIGHT_GRAY);
		btnCapAmerica.setIcon(
				new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Cap America/estatico.png")));
		g.getContentPane().add(btnCapAmerica);

		btnStrange = new JButton();
		btnStrange.setBackground(Color.LIGHT_GRAY);
		btnStrange.setOpaque(true);
		btnStrange.setBounds(350, 10, 73, 81);
		btnStrange
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Dr Strange/tienda.png")));
		g.getContentPane().add(btnStrange);

		btnThor = new JButton();
		btnThor.setBackground(Color.LIGHT_GRAY);
		btnThor.setOpaque(true);
		btnThor.setBounds(440, 10, 73, 81);
		btnThor.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Thor/estatico.png")));
		g.getContentPane().add(btnThor);

	}
}
