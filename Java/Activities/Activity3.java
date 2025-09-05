package activities;

public class Activity3 {
	
	    public static void main(String[] args) {
	        double seconds = 1_000_000_000.0;
	        double earthYearSeconds = 31557600.0;

	        System.out.println("Earth:   " + (seconds / earthYearSeconds));
	        System.out.println("Mercury: " + (seconds / (earthYearSeconds * 0.2408467)));
	        System.out.println("Venus:   " + (seconds / (earthYearSeconds * 0.61519726)));
	        System.out.println("Mars:    " + (seconds / (earthYearSeconds * 1.8808158)));
	        System.out.println("Jupiter: " + (seconds / (earthYearSeconds * 11.862615)));
	        System.out.println("Saturn:  " + (seconds / (earthYearSeconds * 29.447498)));
	        System.out.println("Uranus:  " + (seconds / (earthYearSeconds * 84.016846)));
	        System.out.println("Neptune: " + (seconds / (earthYearSeconds * 164.79132)));
	    }
	}


