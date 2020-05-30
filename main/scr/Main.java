package kartenspiel;

public class Main {

	public static void main(String[] args) {

		// Zufallszahl generieren und als Spieleranzahl Spiel-Konstruktor übergeben
		int x = (int) (Math.random() * ((5 - 2) + 1) + 2);
		Spiel maumau = new Spiel(x);

		maumau.spiele();

	}

}
