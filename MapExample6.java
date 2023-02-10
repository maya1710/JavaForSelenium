package day11;

import java.util.HashMap;

import java.util.Map;


public class MapExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Map<Integer, String> m1 = new HashMap<>();
  // map using hashmap
      m1.put(5,"Bimlesh");
      m1.put(2, "Satwesh");
      m1.put(7, "Sanjay");
      m1.put(10,"Zoya");
     
      System.out.println(m1.keySet());
    //it prints the output in random order or assending order   
     //keyset is a set not a list becoz no duplicates allowed in set 
      
      System.out.println(m1.values());
      System.out.println(m1.containsKey(2));
	}

}
