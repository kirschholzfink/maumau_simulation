public class Karte {
	
	
	private String farbe;
	private int zahl;
	

	public Karte (Farbe farbe, int zahl) {
		this.farbe = farbe.name();
		this.zahl = zahl;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public int getZahl() {
		return zahl;
	}

	@Override
	public String toString() {
		return farbe + " " + zahl;
	}
	


}
