package interfaces;

public class Boisson implements Payant{
	double prix;
	public Boisson (double prix) {
		this.prix = prix;
	}
	// Il faut ici implémenter getPrix()
	 public double getPrix() {
	
	 return prix; // prix étant un attribut le la classe Boisson
	 }
	 public void setPrix() {
		 this.prix = prix;
	 }
}
