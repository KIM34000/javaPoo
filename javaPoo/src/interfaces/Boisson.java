package interfaces;

public class Boisson implements Payant{
	double prix;
	public Boisson (double prix) {
		this.prix = prix;
	}
	// Il faut ici impl�menter getPrix()
	 public double getPrix() {
	
	 return prix; // prix �tant un attribut le la classe Boisson
	 }
	 public void setPrix() {
		 this.prix = prix;
	 }
}
