package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class ArrayListDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mentorsName = new ArrayList<>();
		mentorsName.add("Mukesh");
		mentorsName.add("Hitesh");
		mentorsName.add("Amresh");
		mentorsName.add("Naveen");
		
	//List<String>mentors=Arrays.asList("Mukesh","Hitesh","Amresh","Naveen");
	
	//1for loop
		/*for(int i = 0;i<mentorsName.size();i++)
		{
			System.out.println(mentorsName.get(i));
		}
		*/
	// 2for Each
		/*for (String names:mentorsName)
		{
			System.out.println(names);
		}*/
		
	//3 -Iterator
		  
		Iterator<String> itr = mentorsName.iterator();
		
		while(itr.hasNext())
		{
			String names =itr.next();
			System.out.println(names);
		}
		 }
}
