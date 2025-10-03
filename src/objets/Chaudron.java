package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public int getQuantitePotion() {
		return quantitePotion;
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public void setQuantitePotion(int quantitePotion) {
		this.quantitePotion = quantitePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}

	public Boolean resterPotion() {
		return quantitePotion != 0;
	}

}
