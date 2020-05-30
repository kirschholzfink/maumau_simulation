
import java.util.ArrayList;
import java.util.List;

public class Spiel {

	private List<Spieler> spieler;
	private List<Karte> stapel;

	public Spiel(int spielerAnzahl) {

		this.spieler = new ArrayList<Spieler>();
		this.stapel = new ArrayList<Karte>();
		spielerAnzahl = (int) (Math.random() * ((5 - 2) + 1) + 2);

		for (Farbe f : Farbe.values()) {
			for (int i = 0; i < 8; i++) {
				int zahl = i + 1;
				Farbe farbe = f;
				Karte neueKarte = new Karte(farbe, zahl);
				stapel.add(neueKarte);
			}
		}

		// Spielerinnen initialisieren

		String spielerinnen[] = { "Emily Dickinson", "Charlotte Bronte", "Harper Lee", "Toni Morrison",
				"Margeret Atwood" };

		System.out.println("Hereinspaziert, hereinspaziert. Heute battlen sich in MauMau:\n");

		for (int i = 0; i < spielerAnzahl; i++) {
			String name = spielerinnen[i];
			Spieler spieler = new Spieler(name);
			this.spieler.add(spieler);
			System.out.println("Spielerin " + (i + 1) + ": " + spielerinnen[i] + "\n");

			// Karten verteilen

			for (int j = 0; j < 5; j++) {
				int x = (int) (Math.random() * stapel.size());
				spieler.addKarte(stapel.get(x));
				stapel.remove(x);
			}
		}
	}

	public void spiele() {

		Karte aktKarte = zieheKarte();
		System.out.println("Zufällige erste Karte: " + aktKarte);
		boolean isSchluss = false;

		while (isSchluss == false) {

			for (int i = 0; i < spieler.size(); i++) {
				Karte alteKarte = aktKarte;

				aktKarte = spieler.get(i).spiele(aktKarte);

				if (spieler.get(i).leereHand() == true) {
					System.out.println("\n" + spieler.get(i).toString() + " hat gewonnen! Glückwunsch, du Heldin.");
					isSchluss = true;
					break;
				}

				if (aktKarte == alteKarte) {
					Karte neueKarte = zieheKarte();
					spieler.get(i).addKarte(neueKarte);
					System.out.println(spieler.get(i).toString() + " muss ziehen: Es ist eine " + neueKarte);
				} else
					stapel.add(alteKarte);
			}
		}
	}

	private Karte zieheKarte() {

		int x = (int) (Math.random() * stapel.size());
		Karte temp = stapel.get(x);
		stapel.remove(x);
		return temp;

	}

}
