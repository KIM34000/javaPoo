package heritage;

import java.util.ArrayList;

import java.util.Scanner;



public class Position_main {
	 public static void main(String[] args) {
	Position P0 = new Position(3, 5);
    System.out.println(P0);
    Position P1 = new Position(5, 7);
    System.out.println(P1);
    //two circles values
    C_CERCLE c1 = new C_CERCLE (5,3,9);        
    C_CERCLE c2 = new C_CERCLE (6,7,8);
    //
   PointCouleur pc1 = new PointCouleur(2, 3, 'E', "vert");
   System.out.println(pc1);
   // show two circles
   c1.affiche();
   c2.affiche();
   //boolean?
   System.out.println(c1.compareTo(c1, c2));
   System.out.println(c1.getAire());
   System.out.println(c2.getAire());
   //create array with 3 objects and use length for give a size of array
  C_CERCLE[] cercleArray = new C_CERCLE[3];
   cercleArray[0] = new C_CERCLE(5,3,9);
   cercleArray[1] = new C_CERCLE(4,4,8);
   cercleArray[2] = new C_CERCLE(3,5,7);
   for(int i = 0; i < cercleArray.length; i++) {
	   System.out.println(cercleArray[i].getX());
	   System.out.println(cercleArray[i].getY());
	   System.out.println(cercleArray[i].getRayon());	   
   }
   //create serveral objets
   System.out.println("how many circles do you want to store?");
   Scanner scanner = new Scanner(System.in);
   int nombreCircles = scanner.nextInt();
   //create arraylist
   C_CERCLE[] nombreCircleArray = new C_CERCLE[nombreCircles];
   ArrayList<C_CERCLE> circleArrayList = new ArrayList<C_CERCLE>();
   //The program use differents attributs 
   C_CERCLE c3 = new C_CERCLE ();
   c3.setRayon(5);
   c3.setX(3);
   c3.setY(6);   
   System.out.println(c3.getRayon());
   System.out.println(c3.getX());
   System.out.println(c3.getY());
   //The program use differents methodes
   System.out.println(c3.getPerimetre());
   System.out.println(c3.getAire());
   System.out.println(c3.compareTo(c3,c1));
}
}
 