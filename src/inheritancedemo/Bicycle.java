package inheritancedemo;

public class Bicycle {
        protected int gear;
		protected int speed;
		
		public Bicycle(int startgear, int startspeed){
			this.gear = startgear;
			this.speed = startspeed;
		}
		
		public void setGear(int newvalue){
			gear = newvalue;
		}
		
		public void applyBreak(int decrement){
			speed -= decrement;
		}
		
		public void speedUp(int increment){
			speed =+ increment;
		}
	

}
