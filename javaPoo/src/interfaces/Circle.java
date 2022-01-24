package interfaces;

public class Circle extends CFigure implements ICalculGeometrique,ITypeFigure {
		
	 private double aire;
	 private String type;

	public Circle (int x, int y,double aire, String type) {
		super(x, y);
		this.aire = aire;
        this.type = type;
	}
	public double getAire() {
		// TODO Auto-generated method stub
		return aire;
	}
	public void setAire(double aire) {
		this.aire = aire;
	}
	public String getType(){
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
