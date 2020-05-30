package kartenspiel;

import java.util.ArrayList;
import java.util.List;

public class Spieler {

	private String name;
	private List<Karte> hand;

	public Spieler(String name) {
		this.name = name;
		this.hand = new ArrayList<Karte>();
	}

	public Karte spiele(Karte aktKarte) {

		for (Karte tempKarte : hand) {

			if (tempKarte.getFarbe().equals(aktKarte.getFarbe()) || tempKarte.getZahl() == aktKarte.getZahl()) {
				hand.remove(tempKarte);
				System.out.println(toString() + " legt " + tempKarte.toString() + ".");
				return tempKarte;
			}

		}

		return aktKarte;

	}

	public List<Karte> getHand() {
		return hand;
	}

	public void addKarte(Karte karte) {

		hand.add(karte);
	}

	public boolean leereHand() {

		if (hand.isEmpty() == true) {
			return true;
		} else
			return false;

	}

	@Override
	public String toString() {
		return name;
	}

}
