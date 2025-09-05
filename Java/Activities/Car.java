package activities;

public class Car {

	String color;
	int make;
	String transmission;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("color of car: "+color);
		System.out.println("make of car: "+make);
		System.out.println("transmission of car: "+transmission);
		System.out.println("tyres of car: "+tyres);
		System.out.println("doors of car: "+doors);
	}
	
	public void accelerate() {
		System.out.println("car is moving forward:");
	}
	
	public void brake() {
		System.out.println("applied brake:");
	}
}
