package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " \"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + ":";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(romain romain) {

		String nomRomain = romain.getNom();
		System.out.println(nom + "envoie un grand coup dans la machoire de " + nomRomain);
		int forceCoup = (force * effetPotion) / 3;
		if (effetPotion != 1) {
			effetPotion -= 1;
		}
		romain.recevoirCoup(forceCoup);
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.toString());
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}
}
