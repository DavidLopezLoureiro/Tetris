package interfaz;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
 
/**
 * 
 * Clase desarrollada para poder reproducir musoca en el juego
 *
 */
public class Sounds
{
	public  Clip getSound(String file)
	{
		try
		{
			URL url=new URL("/home/erik/Trabajo Java/Tetris/src/interfaz/musica.wav");
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
			AudioFormat format = audioInputStream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			Clip sound = (Clip)AudioSystem.getLine(info);
			sound.open(audioInputStream);
			return sound;
		}
		catch(Exception e)
		{
			return null;
		}
	}
 
	public static void playSound(Clip clip)
	{
		clip.stop();
		clip.setFramePosition(0);
		clip.start();
		
	}
 
	public static void main(String[] args)
	{
		Sounds sonido=new Sounds();
		Clip sound = sonido.getSound("musica.wav");
		playSound(sound);
		System.out.println("nada");
	}
}
