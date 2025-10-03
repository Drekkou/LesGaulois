package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " \"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + ":";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public int prendreLouche() {
		chaudron.setQuantitePotion(chaudron.getQuantitePotion() - 1);
		if (chaudron.getQuantitePotion() == 0) {
			chaudron.setForcePotion(0);
		}
		return chaudron.getForcePotion();
	}

	public void boosterGaulois(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();

		if (contientPotion) {
			if (nomGaulois == "Obelix") {
				parler("Non, " + nomGaulois + " Non!...Et tu le sais très bien!");
			} else {
				int forcePotion = prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + "un peu de potion magique");
			}
		} else {
			parler("Désolé " + nomGaulois + "il n'y a plus une seul goutte de potion");
		}
	}

}
