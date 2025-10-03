package personnages;

public class romain {
	private String nom;
	private int force;

	public romain(String nom, int force) {
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
		return "Le romain " + nom + ":";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void recevoirCoup(int forceCoup) {
		this.force = this.force - forceCoup;
		if (force < 1) {
			parler("J'abandonne");
		} else {
			parler("Aïe!");
		}
	}
}
