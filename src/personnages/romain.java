package personnages;

public class romain {
	private String nom;
	private int force;

	public romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert (this.IsInvariantVerified());
	}

	private Boolean IsInvariantVerified() {
		return force >= 0;
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
		assert (forceCoup > 0);
		int temp = this.force;
		this.force = this.force - forceCoup;
		assert (this.IsInvariantVerified());
		if (force < 1) {
			parler("J'abandonne");
		} else {
			parler("Aïe!");
		}
		assert (temp > this.force);
	}

	public static void main(String[] args) {
		romain minus = new romain("Minus", 6);

	}
}
