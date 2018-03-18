
public class Statek extends ObiektKosmiczny {
	
	double iloscPaliwa;
	
	int zebranePunkty;
	
	//to bedzie nam mowilo o jego stanie
	boolean destructable = false; 
	

	public Statek() {
		// TODO Auto-generated constructor stub
	}

	public Statek(double M, double PW, double VX, double VY, double AX,
			double AY, boolean SPRING) {
		super(M, PW, VX, VY, AX, AY, SPRING);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
