package polymorphisme;

public class C_CARRE extends C_FIGURE {
	private int edge;
    
    public C_CARRE (int x, int y, int edge)
    {
        super(x,y);
        this.edge = edge;
    }
    public int getedge() {
		return edge;
	}
	public void setEdge(int edge) {
		this.edge = edge;
	}
    public int calculateArea() {
        return edge*edge;
    }
    public int calculatePrimeter() {
        return edge*4;
    }
    public void affiche ()
    {
        super.affiche();
        System.out.println("et ma coté est : " + this.edge);
    }
}
