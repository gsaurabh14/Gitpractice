package WAP;

public class Cons {

	int height;
	int width;
	int depth;
	
	Cons(int height, int width, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//Cons(int height, int width){
		//this.width = width;
		//this.height = height;
		//this.depth = 10;
	//}
	Cons(){
		this.width = 10;
		this.height = 10;
		this.depth = 10;
	}
	Cons(int dimension){
		this.width =dimension;
		this.height = dimension;
		this.depth = dimension;
	}
	int volume(){
		return width*height*depth;
	}
	
	public static void main(String[] args) {
	int result;
	
	Cons a = new Cons();
	result = a.volume();
	System.out.println("volume of cube" + result);
	
	Cons b = new Cons(5);
	result = b.volume();
	System.out.println("volume of cube" + result);
	
	//Cons c = new Cons(5,10);
	//result = c.volume();
	//System.out.println("volume of cube" + result);

	}

}
