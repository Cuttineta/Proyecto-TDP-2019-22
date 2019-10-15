package Splash_Screen;

import java.io.File;

import javax.sound.sampled.*;

public class MusicPlayer extends Thread {

	private File musicFile = new File(
			"C:\\Users\\joaco\\OneDrive\\Documentos\\GitHub\\Proyecto-TDP-2019-22\\src\\Splash_Screen\\musica.wav");

	public MusicPlayer() {

	}

	public void start() {

		playSound(musicFile.getAbsolutePath());

	}

	private void playSound(String fileName) {
		try {
			File soundFile = new File(fileName);
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
			AudioFormat format = ais.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			Clip clip = (Clip) AudioSystem.getLine(info);
			clip.open(ais);
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-10);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
