package activities;
import java.util.HashSet;
public class Activity10 {
	
	
	    public static void main(String[] args) {
	        HashSet<String> hs = new HashSet<>();
	       
	        hs.add("Apple");
	        hs.add("Banana");
	        hs.add("Mango");
	        hs.add("Orange");
	        hs.add("Grapes");
	        hs.add("Pineapple");

	      
	        System.out.println("Size of HashSet: " + hs.size());

	       
	        hs.remove("Banana");

	       
	        boolean removed = hs.remove("Strawberry");
	        System.out.println("Trying to remove Strawberry: " + removed);

	        
	        System.out.println("Contains Mango? " + hs.contains("Mango"));

	     
	        System.out.println("Updated HashSet: " + hs);
	    }
	

	    }
	


