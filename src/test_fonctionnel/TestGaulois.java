package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);

		asterix.parler("Bonjour Obelix.");
		obelix.parler("Bonjour Asterix. Ca te dirait d'aller chasser des sangliers.");
		asterix.parler("Oui, très bonne idée");

	}

}
