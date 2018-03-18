import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class OknoGlowne extends JFrame {
	
	MenuGlowne menuGry = new MenuGlowne();
	OknoTytulowe tytulowe = new OknoTytulowe();

	OknoGry gra = new OknoGry();
	
	//to bedzie nasz smaczek, bedzie mozliwosc wprowadzenia kodu konami jako cheatu
	boolean[] konami = {false, false, false, false, false, false, false, false, false, false};
	
	
	
	public OknoGlowne() throws HeadlessException {
		
		this.setBackground(Color.GREEN);
		this.setTitle("E&M SpaceSim");
		this.setLayout(new GridLayout(1, 2));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(860,640);
		
		this.add(menuGry);
		this.add(tytulowe);
		
		
		this.setFocusable(true);
		this.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			
			// tu bedzie to sprawdzane
			public void keyPressed(KeyEvent c) {
				 if (c.getKeyChar() == 27)
					 System.exit(0);
				 if (c.getKeyChar() == 38)
					 konami[0]=true;
				 if ((c.getKeyChar() == 38) && (konami[0]==true))
					 konami[1]=true;
				 	System.out.println("Weszlo!");
				
			}
		});
	}

	public OknoGlowne(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public OknoGlowne(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public OknoGlowne(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OknoGlowne frame = new OknoGlowne();
		frame.setVisible(true);

	}

}
