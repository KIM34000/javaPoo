package heritage;


	public class Point extends Position {
	    private char nom;

	    public Point(){
	        
	    }
//	    public Point(point){	    
//	    super (point.x, point.y);
//	    nom = point.nom;
//	    }
	    public Point(int x, int y, char nom){
	        super(x,y);
	        this.nom = nom;
	    }   
	    
	    public char getNom(){
	        return this.nom;
	    }
	    public void setNom(char nom){
	        this.nom = nom;
	    }
	    public void affiche() {
	    	 System.out.println("Je suis en " + x + " " + y);
	    	 }
	    @Override
	    public String toString() {
	        return this.nom + "(" + this.x + this.y + ")";
	    }
	   
	    
	}

