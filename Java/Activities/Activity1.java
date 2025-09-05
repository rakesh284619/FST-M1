package activities;

public class Activity1 {
	
	public static void main(String[] args) {
		Car mahindra = new Car();
		mahindra.make=2014;
		mahindra.color="black";
		mahindra.transmission="manual";
		
		mahindra.displayCharacteristics();
		mahindra.accelerate();
		mahindra.brake();
	}

}
