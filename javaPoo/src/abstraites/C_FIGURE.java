package abstraites;

public abstract class C_FIGURE {
	
		 private int x, y;
		    
//		    public C_FIGURE(int x, int y)
//		    {
//		        this.x = x;
//		        this.y = y;
//		    }
//		    public int getX() {
//				return x;
//			}
//			public void setX(int x) {
//				this.x = x;
//			}
//		    public int getY() {
//				return y;
//			}
//			public void setY(int y) {
//				this.y = y;
//			}
//			public  int calculateArea()
//			{
//			    return(0);
//			}
			 public void affiche()
			    {
			        System.out.println("Je suis en" + this.x + " " + this.y + " ");
			    }
			protected void dessine() {
				affiche();
			}
			
		    
	}


