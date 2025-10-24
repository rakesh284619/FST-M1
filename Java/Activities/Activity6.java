package activities;

import java.lang.foreign.AddressLayout;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
    
    Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<String>();
    }
    void onboard(String passengerName) {
    	if (passengers.size()<=maxPassengers) {
    		this.passengers.add(passengerName);
    	}else {
			System.out.println("Plane is full");
		}  	
    	
    }
    public Date takeoff() {   
    	this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
    }
    public Date land() {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear(); //doubt
    	return this.lastTimeLanded;
    	
    }
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    	
    }
    public List<String> getPassesngers() {
    	return this.passengers;
    }
}


public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plane plane = new Plane(10);
		plane.onboard("Srikanth");
		plane.onboard("Ram");
		plane.onboard("Babu");

		System.out.println("Take off time is " + plane.takeoff());
		System.out.println("Passenger names are: " + plane.getPassesngers());
		Thread.sleep(5000); 
		plane.land();
		System.out.println("Landing time is :" + plane.getLastTimeLanded()); 

	}

}
