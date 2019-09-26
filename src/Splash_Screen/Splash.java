package Splash_Screen;

import java.awt.Color;

import javax.swing.*;

public class Splash extends JFrame {

	private static final long serialVersionUID = 1L;

	public JPanel contentPane;
	public JProgressBar progressBar;
	public JTextField textfield;

	public Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);

		progressBar = new JProgressBar();
		progressBar.setForeground(Color.DARK_GRAY);
		progressBar.setBounds(60, 480, 300, 14);
		progressBar.setBackground(Color.WHITE);
		contentPane.add(progressBar);

		textfield = new JTextField();
		textfield.setForeground(new Color(255, 255, 255));
		textfield.setEditable(false);
		textfield.setBounds(60, 457, 300, 22);
		textfield.setColumns(10);
		textfield.setBackground(new Color(0, 0, 0));
		textfield.setBorder(null);
		contentPane.add(textfield);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Splash.class.getResource("/Imagenes/splash_avengers.png")));
		lblNewLabel.setBounds(0, 0, 1200, 600);

		contentPane.add(lblNewLabel);
	}

}
