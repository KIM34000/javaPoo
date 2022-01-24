package heritage;

public class PointCouleur extends Point{
	protected String couleur;
    public PointCouleur(){
        super();
    }

    public PointCouleur( int x, int y, char nom, String couleur) {
        super(x, y, nom);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString()+ "" + this.couleur;
    }
}
