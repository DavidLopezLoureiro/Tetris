
import java.io.File;
import java.io.IOException;
 
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 

public class Sounds implements LineListener {
     

    boolean completado; //para saber si se ha reproducido el audio o no..jj
     
   
    void play(String audioFilePath) {
        File audioFile = new File(audioFilePath);
 
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = (Clip) AudioSystem.getLine(info);
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
             
            audioClip.start();
             
            while (!completado) {
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
            audioClip.close();
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("El archivo no esta soportado.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("La línea de audio para reproducir no está disponible..");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error.");
            ex.printStackTrace();
        }
         
    }
     
 
    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
         
        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");
             
        } else if (type == LineEvent.Type.STOP) {
            completado = true;
            System.out.println("Playback completed.");
        }
 
    }
 
    public static void main(String[] args) {
        String audioFilePath = "C:\\Users\\Xabier\\git\\Tetris\\src\\musica\\Original Nintendo Tetris Theme - Extended 10min.wav";
        Sounds player = new Sounds();
        player.play(audioFilePath);
    }
 
}