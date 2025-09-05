package activities;


	interface BicycleParts {
	    int tyres = 2;      
	    int maxSpeed = 50;  
	}

	
	interface BicycleOperations {
	    void applyBrake(int decrement);
	    void speedUp(int increment);
	}


	class Bicycle implements BicycleParts, BicycleOperations {
	    private int speed;

	    public Bicycle(int startSpeed) {
	        speed = startSpeed;
	    }

	   
	    public void applyBrake(int decrement) {
	        speed -= decrement;
	        System.out.println("Speed after brake: " + speed);
	    }

	    
	    public void speedUp(int increment) {
	        speed += increment;
	        System.out.println("Speed after speed up: " + speed);
	    }

	    public void displayInfo() {
	        System.out.println("Bicycle has " + tyres + " tyres and max speed of " + maxSpeed + " km/h.");
	    }
	}

	
	public class Activity7 {
	    public static void main(String[] args) {
	        Bicycle myBike = new Bicycle(10);
	        myBike.displayInfo();
	        myBike.speedUp(15);
	        myBike.applyBrake(5);
	    }
	}


