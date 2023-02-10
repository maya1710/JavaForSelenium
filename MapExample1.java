package Day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,List<String>> m1 = new HashMap<>();
		List<String> l1 =Arrays.asList("Maven","Selenium","Java");
		List<String> l2 =Arrays.asList("TestNG","JS","Phython");
		
		m1.put(100, l1);
		m1.put(200, l2);
		System.out.println(m1);
		
		List<String> myList=m1.get(200);
		String value = myList.get(2);
		System.out.println(value);
		
		System.out.println(m1.get(200).get(1));
		
		
		
	}

}
