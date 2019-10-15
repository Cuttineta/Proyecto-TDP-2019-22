package Sonido;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.spi.AudioFileReader;

import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class AudioPlayer implements Runnable {

	protected File file = new File("C:\\Users\\joaco\\Downloads\\musica.mp3");
	protected String archivo;

	public AudioPlayer(String a) {

		// archivo = file.getAbsolutePath();
		archivo = a;

	}

	@Override
	public void run() {
		try {
			// File f = new File(this.getClass().getResource(this.file).toURI());
			FileInputStream fis = new FileInputStream(file);
			Player playMP3 = new Player(fis);
			playMP3.play();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}