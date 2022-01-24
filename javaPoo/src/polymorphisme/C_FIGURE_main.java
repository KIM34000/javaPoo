package polymorphisme;

import java.util.Scanner;

public class C_FIGURE_main {

	public static void main(String[] args) {
		C_FIGURE[] figure = new C_FIGURE[100];
		Scanner scanner = new Scanner(System.in);
		int numberCircles, numberSquares;
		int maxCircles = 100;
		int maxSquares;
		
		do {
			System.out.println("How many circles would you like to draw ? (max "+maxCircles+")");
			//storing use input into a temporary string
			String temp = scanner.nextLine();
			//checking every charecter in the string to see if its matches numbers in 0 to 9
			boolean flag = temp.matches("[0-9]+");
			if (flag) {//If the match is successful, the input string is full of numbers
				numberCircles = Integer.parseInt(temp);//Convert temp to int and pass it to the age we want
				//the number should not be more than 100
				if(numberCircles > maxCircles) {
					System.out.println("the number is too big" + maxCircles);
					continue;
				}
			} else {//If the match is not successful, it goes to the next loop
				System.out.println("The values entered do not match");
				continue;//Jump out of this while loop and execute the next while loop
			}
			if (temp != null) {
				break;
			} 
			
		} while (true);
//		while (true) {//Always receive user input
//			System.out.println("Please enter the size: ");
//			String temp = scanner.nextLine();//Transit value
//			boolean flag = temp.matches("[0-9]+");//Regular, all match numbers
//			if (flag) {//If the match is successful, the input string is full of numbers
//				size = Integer.parseInt(temp);//Convert temp to int and pass it to the age we want
//			} else {//If the match is not successful, it goes to the next loop
//				System.out.println("The values entered do not match");
//				continue;//Jump out of this while loop and execute the next while loop
//			}
//			if (temp != null) {
//				break;
//			} 
//		}
				
		
		maxSquares = 100 - numberCircles;
		do {
			System.out.println("How many squares would you like to draw ? (max "+maxSquares+")");
			String temp = scanner.nextLine();
			//checking every charecter in the string to see if its matches numbers in 0 to 9
			boolean flag = temp.matches("[0-9]+");
			if (flag) {//If the match is successful, the input string is full of numbers
				numberSquares = Integer.parseInt(temp);//Convert temp to int and pass it to the age we want
				//the number should not be more than 100
				if(numberSquares > maxSquares) {
					System.out.println("the number is too big" + maxSquares);
					continue;
				}
			} else {//If the match is not successful, it goes to the next loop
				System.out.println("The values entered do not match");
				continue;//Jump out of this while loop and execute the next while loop
			}
			if (temp != null) {
				break;
			} 
		} while (true);
		
		//creating circle obj and inserting them into array
		for(int i =0; i < numberCircles; i++) {
			//numberCircles = user giving
			figure[i] = new C_CERCLE(1,1,2);
		}
		//creating square obj and inserting them into array starting at array number = numbercircles
		for(int i =numberCircles; i < maxCircles; i++) {
			//maxCircles = 100
			figure[i] = new C_CARRE(1,1,2);
		}
		int areaCircle = 0;
		for(int i =0; i < numberCircles; i++) {
			areaCircle = areaCircle + figure[i].calculateArea();
		}
		System.out.println("The area of all the circles is: " + areaCircle);
		
		int areaSquare = 0;
		for(int i =numberCircles; i < (numberCircles+numberSquares); i++) {
			areaSquare = areaSquare + figure[i].calculateArea();
		}
		System.out.println("The area of all the circles is: " + areaSquare);
	}

}
