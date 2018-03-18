import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



public class Soundtrack {
	
	String bip = "bip.mp3";
	Media hit = new Media(new File(bip).toURI().toString());
	MediaPlayer mediaPlayer = new MediaPlayer(hit);
	
	
	
	
	public Soundtrack() {
		mediaPlayer.play(); // TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
