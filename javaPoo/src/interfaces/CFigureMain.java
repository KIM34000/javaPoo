package interfaces;

import java.util.ArrayList;

public class CFigureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CFigure>figureObj = new ArrayList<CFigure> ();
		figureObj.add(new Circle(5,7,15.25,"circle"));
		figureObj.add(new Square(6,9,25.25,"square"));
		figureObj.add(new Circle(8,6,35.25,"circle"));
		figureObj.add(new Square(11,71,55.25,"square"));
		for(int i =0; i < figureObj.size();i++) {
			System.out.println(figureObj.get(i).getAire());
			System.out.println(figureObj.get(i).getType());
		}
	}

}
