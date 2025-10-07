package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements = new Equipement[2];
	int nbEquipements = 0;

	public Romain(String nom, int force) {
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

	private void equipeLe(Equipement equipement) {
		this.equipements[this.nbEquipements] = equipement;
		this.nbEquipements++;
		System.out.println("Le soldat " + this.nom + " s'équipe avec un " + equipement.toString() + "!");
	}

	public void sEquiper(Equipement equipement) {
		switch (this.nbEquipements) {
		case 0:
		case 1: {
			if (this.nbEquipements == 0) {
				this.equipeLe(equipement);
			} else if (this.equipements[0] == equipement) {
				System.out.println("Le soldat " + this.nom + " possède deja un " + equipement.toString() + " !");
			} else {
				this.equipeLe(equipement);
			}
			break;
		}
		default:
			System.out.println("Le soldat " + this.nom + " est déjà bien protégé !");
			break;
		}

	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 4);

		Equipement casque = Equipement.CASQUE;
		Equipement bouclier = Equipement.BOUCLIER;

		minus.sEquiper(casque);
		minus.sEquiper(casque);
		minus.sEquiper(bouclier);
		minus.sEquiper(casque);
	}
}
