package inheritancedemo;

public class Bimountainbike extends Bicycle {
	int seatheight;
	public Bimountainbike(int startgear, int startspeed,int startheight) {
		super(startgear, startspeed);
	this.seatheight = startheight;
	}
  public void setHeigth(int value){
	 seatheight = value; 
  }
}
