package interfaces;

import java.util.ArrayList;

public class PayantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Payant>ligne_prix = new ArrayList<Payant> ();
		ligne_prix.add(new Service(15.23));
		ligne_prix.add(new Service(8.23));
		ligne_prix.add(new Boisson(20.23));
		ligne_prix.add(new Service(25.20));
		for(int i =0; i < ligne_prix.size(); i++) {
			System.out.println(ligne_prix.get(i).getPrix());
		}
		
	}

}
