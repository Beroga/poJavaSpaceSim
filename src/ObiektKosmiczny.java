
public class ObiektKosmiczny {
	
	//parametry startowe
	double masa;
	double parametr_wielkosci;
	boolean sprezysty;
	
	//te sie beda zmieniac
	double Vx;
	double Vy;
	
	double ax;
	double ay;
	

	public ObiektKosmiczny() {
		// TODO Auto-generated constructor stub
	}
	
	public ObiektKosmiczny(double M, double PW, double VX, double VY, double AX, double AY, boolean SPRING) {
		masa = M;
		parametr_wielkosci = PW;
		sprezysty = SPRING;
		
		Vx = VX;
		Vy = VY;
		
		ax = AX;
		ay = AY;

	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
