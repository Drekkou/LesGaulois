package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

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

	public void frapper(Romain romain) {

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

	public void setVillage(Village village) {
		this.village = village;
	}

	public void sePresenter() {
		if (village == null) {
			parler("Bonjour, je m'appelle Doublepolémix. Je voyage de villages en villages.");
		} else if (village.getChef().nom == this.nom) {
			parler("Bonjour, je m'appelle Abraracourcix. Je suis le chef le village Village des Irreductibles.");
		} else if (village != null) {
			parler("Bonjour, je m'appelle Astérix. J'habite le village Village des Irreductibles.");
		}
	}
}
