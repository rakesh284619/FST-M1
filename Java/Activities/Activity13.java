package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
	
		List<Integer> array = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); 
		System.out.println("enter the numbers to add to list");
		System.out.println(array.size());
				
		while(scan.hasNextInt() && array.size()<=4) {
			array.add(scan.nextInt());
		}
		
		System.out.println("Array size is "+ array.size());
		System.out.println(array);
		scan.close(); //close the scanner
		
		int genidx=ran.nextInt(array.size() - 1); 
		System.out.println("random index generated is "+ genidx);
		
		System.out.println("randam value in the index is "+ array.get(genidx));
	}

}
