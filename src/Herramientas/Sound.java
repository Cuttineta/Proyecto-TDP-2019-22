package Herramientas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.*;
import sun.audio.*;

public class Sound {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		frame.setResizable(false);
		frame.setVisible(true);
		JButton button = new JButton("Click me");
		button.setOpaque(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BufferedInputStream bis = new BufferedInputStream(
						getClass().getClassLoader().getResourceAsStream("src/musica.wav"));
				AudioInputStream ais;
				try {
					ais = AudioSystem.getAudioInputStream(bis);

					Clip sonido = AudioSystem.getClip();
					sonido.open(ais);
					sonido.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
					e.printStackTrace();
				}

			}

		});
		frame.getContentPane().add(button);

	}
}
