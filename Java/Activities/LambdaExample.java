package activities;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("rick");
		list.add("negan");
		list.add("daryl");
		list.add("glenn");
		list.add("carl");
		
		list.forEach((names)->System.out.println(names));
		
	}

}
