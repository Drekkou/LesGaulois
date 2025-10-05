package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		romain brutus = new romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);

		panoramix.fabriquerPotion(4, 3);

		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}

}
