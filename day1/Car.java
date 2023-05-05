package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Applying the Break");
	}
	public void applyGear() {
		System.out.println("Applying the Gear");
	}
	public void switchOnAc() {
		System.out.println("Swith On the Ac");
	}
	public void applyAccelerate() {
		System.out.println("Applying the Accelerate");
	}
	public static void main(String[] args) {
		Car BMW=new Car();
		BMW.applyBreak();
		BMW.applyGear();
		BMW.switchOnAc();
		BMW.applyAccelerate();	
	}

}
