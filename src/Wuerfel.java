
public class Wuerfel {
	
	int augenzahl;
	int seitenzahl;
	
	public Wuerfel() {
		augenzahl = 0;
		seitenzahl = 6;
	}
	
	public Wuerfel(int seitenzahl) {
		augenzahl = 0;
		this.seitenzahl = seitenzahl;
	}
	
	public int wuerfeln() {
		augenzahl = (int) (Math.random() * seitenzahl + 1);
		
		return augenzahl;
	}
	
}
