import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;


// Tu bedzie wyswietlal sie jakis obrazek

public class OknoTytulowe extends JPanel {

	public OknoTytulowe() {
		this.setSize(400, 300);
		this.setBackground(Color.BLUE);
	}

	public OknoTytulowe(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public OknoTytulowe(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public OknoTytulowe(LayoutManager arg0, boolean arg1) {
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
