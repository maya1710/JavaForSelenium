package Day9;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mentorsName = new ArrayList<>();
		mentorsName.add("Mukesh");
		mentorsName.add("Hitesh");
		mentorsName.add("Amresh");
		mentorsName.add("Naveen");
		
	System.out.println(mentorsName);
	System.out.println(mentorsName.remove(2));
	System.out.println(mentorsName);
	System.out.println(mentorsName.remove("Mukesh"));
	System.out.println(mentorsName);
	System.out.println(mentorsName.contains("hitesh"));
	System.out.println(mentorsName.isEmpty());
	mentorsName.clear();
	System.out.println(mentorsName);
List<String>fewMoreMentors=Arrays.asList("Adarsh","Silpa","Pranab","Kirti");
    
    //how to add new mentors in old list

    mentorsName.addAll(fewMoreMentors);
    //mentorsName.add(fewMoreMentors);
    
    System.out.println(mentorsName);
    
    
    //use for loop, foreach or use iterator pick values one by one from 
    //fewmorementors list and add one by one in mentorsname list
    
	}
}
