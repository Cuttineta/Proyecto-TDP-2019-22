package Herramientas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				music();
			}

		});
		frame.getContentPane().add(button);

	}

	public static void music() {
		AudioPlayer MGP = AudioPlayer.player;
		AudioStream BGM;
		AudioData MD;
		ContinuousAudioDataStream loop = null;
		try {
			BGM = new AudioStream(new FileInputStream("musica.mp3"));
			MD = BGM.getData();
			loop = new ContinuousAudioDataStream(MD);
		} catch (IOException e) {
			e.printStackTrace();
		}

		MGP.start(loop);

	}
}
