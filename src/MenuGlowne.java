import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MenuGlowne extends JPanel {

	JButton start = new JButton("Rozpocznij gre");
	JButton highscore = new JButton("Pokaz najlepsze wyniki");
	JButton howto = new JButton("Jak grac?");
	JButton quit = new JButton("Wyjscie z gry");
	
	JButton lang = new JButton("ZMIEN JEZYK"); // WSTAWIC OBRAZKI
	
	OknoPomocy o1 = new OknoPomocy();
	
	// Można ustawic by bylo przezroczyste
	
	
	public MenuGlowne() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setSize(150,300);
		//this.add(Box.createVerticalGlue());
		this.add(start);
		this.add(Box.createRigidArea(new Dimension(10, 20)));
		this.add(howto);
		this.add(Box.createRigidArea(new Dimension(10, 20)));
		this.add(highscore);
		this.add(Box.createRigidArea(new Dimension(10, 20)));
		this.add(lang);
		this.add(Box.createRigidArea(new Dimension(10, 20)));
		this.add(quit);
		
		
		
		howto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				OknoPomocy frame = new OknoPomocy();
				frame.setVisible(true);
				
			}
		});
		
		quit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);	
			}
		});
	}
	

	public MenuGlowne(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MenuGlowne(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MenuGlowne(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MenuGlowne panel = new MenuGlowne();
		panel.setVisible(true);
	}

}
