package GUI.Paneles;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.VentanaInicial;

public class PanelStats extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel monedasLabel;
	private PanelJuego Gui;
	
	public PanelStats(int AnchoVentana,int AltoVentana,PanelJuego g) {
		Gui=g;
		this.setLayout(null);
		this.setBounds(0, 0, AnchoVentana, 50);//Seteo espacio para el panel
		
		monedasLabel=new JLabel();
		monedasLabel.setIcon(new ImageIcon("SpritesAvengers/Monedas.png"));
		monedasLabel.setBounds(AnchoVentana-360,0,400,50);
		monedasLabel.setText("0");//Gui.getJuego().getPuntaje()
		monedasLabel.setVerticalTextPosition(JLabel.TOP);//Deja alineado el texto con la imagen
		monedasLabel.setHorizontalAlignment(JLabel.LEFT);
		monedasLabel.setVerticalAlignment(JLabel.CENTER);
		monedasLabel.setForeground(Color.BLACK);
		monedasLabel.setFont(new Font("Arial",Font.BOLD,40));
		
		JLabel fondo=new JLabel(new ImageIcon("SpritesAvengers/Fondo/Metal.png"));
		fondo.setBounds(0, 0, AnchoVentana,50);
		
		eliminarNinja();
		pauseButton();
		add(monedasLabel);
		add(fondo);
	
	}
	
	public void pauseButton() {
		JButton pause=new JButton();
		pause.setBorder(null);
		pause.setBorderPainted(false);
		pause.setContentAreaFilled(false);
		pause.setFocusable(false);
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//HAY QUE COMPLETAR CON LO QUE VA A HACER EL BOTON DE PAUSA
				//Gui.getJuego().pausarJuego();
				//Gui.pausarPanelJuego();
				//Gui.cambiar(Gui.getVentanaInicial().getPausa()); //Pone como panel principal el panel de pausa
			}
		});
		pause.setBounds(10, 0,70,50);
		pause.setIcon(new ImageIcon("Sprites/Botones/BotonPausa.png"));
		//pause.setRolloverIcon(new ImageIcon("Sprites/Botones/BotonPausaEntered.png"));
		add(pause);	
	}
	
	public void eliminarNinja() {
		JButton eliminarNinja=new JButton();
		eliminarNinja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//HAY QUE COMPLETAR CON LO QUE VA A HACER EL BOTON DE PAUSA
				Gui.getJuego().getMapa().getPanelMapa().eliminar();
				actualizarOro(30);
		}});
		eliminarNinja.setBounds(100, 0,70,50);
		add(eliminarNinja);	
	}
	
	public void actualizarOro(int oro) {
		monedasLabel.setText(""+oro);
	}
}
