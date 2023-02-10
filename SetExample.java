package Day10;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> s1 =new HashSet<>();
		s1.add("Selenium");
		s1.add("selenium");
		s1.add("Selenium");
		s1.add("Java");
		s1.add("TestNG");
		s1.add("Maven");
		s1.add(null);
		s1.add(null);
		
		/*System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.remove("Java"));
		System.out.println(s1.isEmpty());
		System.out.println(s1);
		*/
		for(String str :s1)
		{
			System.out.println(str);
		}
		/*for (int i =0; i<s1.size();i++)
		{
		System.out.println(s1.get);	
		}
		dont have get.thats why basic for loop cant used
        */
	}

}
