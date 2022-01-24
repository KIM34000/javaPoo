package polymorphisme;

public class C_CERCLE extends C_FIGURE {
	private int radius;
	    
	public C_CERCLE (int x, int y, int radius)
	{
	    super(x,y);
	    this.radius = radius;
	}
    public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public  int calculateArea()
	{
	    return (int) ((radius*radius)*Math.PI);
	}
	public double  calculatePerimeter()
	{
	    return  (radius*2)*Math.PI;
	}
	public void affiche ()
	{
	    super.affiche();
	    System.out.println("et ma rayon est : " + this.radius);
	}
}
