package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
List<String> strList=new ArrayList<>();
strList.add("apple");
strList.add("watermelon");
strList.add("mango");
strList.add("banana");
strList.add("cherry");

for(String name : strList) {
	System.out.println(name);
}

 System.out.println("3rd name is :"+strList.get(2));
 System.out.println("mango exist:"+strList.contains("mango"));
 System.out.println("no of list: "+strList.size());
 strList.remove("mango");
 System.out.println("no of list: "+strList.size());

	}

}
