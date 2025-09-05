package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Activity12 {
	public static void main(String[] args) {
		
		List<Integer> intList=new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("Enter the number to add to the list:");
		while(scan.hasNextInt()) {
			intList.add(scan.nextInt());
			
		}
		System.out.println("list of numbers: "+ intList);
	
	scan.close();
	
	int genIndex = rand.nextInt(intList.size()-1);
	System.out.println("generated index:" +genIndex);
	System.out.println("value at index: "+ intList.get(genIndex));
	}
}
