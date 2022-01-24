package interfaces;

public class Service implements Payant{
	double prix;
	public Service(double prix) {
		this.prix = prix;
	}
	 public double getPrix() {
		
		 return prix; // prix étant un attribut le la classe Service
		 }
	 public void setPrix() {
		 this.prix = prix;
	 }
}
