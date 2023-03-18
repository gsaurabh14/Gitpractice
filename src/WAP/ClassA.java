package WAP;

public class ClassA {
	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		aobj.add();
		aobj.sub();

	}
	
	public void add()
	{
		int a=10;
		int b= 20;
		int c = a+b;
		System.out.println("addn value"+ c);
		
	}
	
	public void sub(){
		int a = 10;
		int b= 20;
		int c=a-b;
		System.out.println("addn value"+ c);
	}

}


