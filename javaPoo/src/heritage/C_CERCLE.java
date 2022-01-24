package heritage;

public class C_CERCLE extends Position{
	double rayon;
    public C_CERCLE(){
        super();
    }

    public C_CERCLE(double rayon) {
        this.rayon = rayon;
    }

    public C_CERCLE(double rayon, int x, int y) {
        super(x, y);
        this.rayon = rayon;
    }
    public double getRayon(){
        return this.rayon;
    }
    public void setRayon(double rayon){
        this.rayon = rayon;
    }
    public double getPerimetre(){
        return 2 * Math.PI * this.rayon;        
}
    public double getAire(){
        return Math.PI * this.rayon * this.rayon;
    }
   
        public int compareTo(C_CERCLE o, C_CERCLE p) {    	
    	        if(o.getRayon()<p.getRayon()) {   	
    	            return -1;    	
    	        }else if (o.getRayon()>p.getRayon())    	
    	            return 1;
    	    	        else
    	            return 0;
    	    }
        public void affiche() {
        	 System.out.println("Je suis en " + x + " " + y);
        	 }
    @Override
    public String toString() {
        return "Cercle{" + "rayon=" + rayon + '}';
    }
}
