package personnages;

public class Village {
	private int NB_VILLAGEOIS_MAX;
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;

	private Gaulois[] villageois;

	public Village(int nB_VLLAGEOIS_MAX, String nom, Gaulois chef) {
		super();
		this.NB_VILLAGEOIS_MAX = nB_VLLAGEOIS_MAX;
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
	}

	@Override
	public String toString() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {

		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}

	public Gaulois trouverVillageois(int numeroVillageois) {
		if (numeroVillageois > nbVillageois) {
			System.out.println("Il n'y à pas autant de Villageois dans le village !");
			return null;
		} else {
			return villageois[numeroVillageois - 1];
		}
	}

	public void afficherVillage() {
		System.out.println(
				"Dans le Village \" " + nom + "\" du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("-" + villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village(30, "Village des Irreductibles", abraracourcix);

		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);

		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);

		village.afficherVillage();
		Gaulois doublePolemix = new Gaulois("DoublePolemix", 4);

		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
	}
}
