package kartenspiel;

public class Karte {
	
	//Attribute
	private String farbe;
	private int zahl;
	
	//Konstruktor
	
	public Karte (Farbe farbe, int zahl) {
		this.farbe = farbe.name();
		this.zahl = zahl;
	}
	
	//Methoden
	
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
