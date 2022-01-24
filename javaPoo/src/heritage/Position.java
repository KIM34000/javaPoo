package heritage;
//Déclaration de la classe C_POINT
public class Position {
    protected int x;
    protected int y;
    
    public Position(){
        
    }
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    public void deplace(int dx,int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    public void affiche(){
        System.out.println("x is: " + this.x + " and y is: " + this.y);
    }
//	public int compareTo(C_CERCLE o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}    	
	}

