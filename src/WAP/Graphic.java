package WAP;

public abstract class Graphic {
	int x,y;
	void moveto(int newx, int newy){
		System.out.println("move to"+ x +"move to " + y);
	}
	abstract void draw();
	abstract void resize();
	

}
