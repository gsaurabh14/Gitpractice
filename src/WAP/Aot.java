package WAP;

import java.util.Scanner;

public class Aot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the vale of height");
		double height = sc.nextDouble();
		System.out.println("enter the value of base");
		double base = sc.nextDouble();
		
		Aot abc = new Aot();
		double areaoftri = abc.Area(height, base);
		System.out.println("answer"+ " "+ areaoftri);
		

	}
	double Area(double h, double b)
	{
        double c = (b*h)/2;
        return c;
	
	}
	

}
