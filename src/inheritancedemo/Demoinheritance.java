package inheritancedemo;

//import WAP.Bimountainbike;

public class Demoinheritance {

	public static void main(String[] args) {
		Bimountainbike bike = new Bimountainbike(10,20,5);
		System.out.println("gear is " + bike.gear);
		System.out.println("spead is " + bike.speed);
		System.out.println("height is " + bike.seatheight);
		bike.applyBreak(1);
		System.out.println("spead is " + bike.speed);

	}

}
