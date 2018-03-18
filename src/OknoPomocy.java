import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class OknoPomocy extends JFrame {
	
	JLabel tekstPomocy = new JLabel("Okno pomocy ");
	

	public OknoPomocy() throws HeadlessException {
		this.setBackground(Color.white);
		this.setTitle("Pomoc");
		this.add(tekstPomocy);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(350,100);

	}

	public OknoPomocy(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public OknoPomocy(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public OknoPomocy(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OknoPomocy frame = new OknoPomocy();
		frame.setVisible(true);


	}

}
