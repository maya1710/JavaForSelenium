package day11;

import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class MapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Map<Integer, String> m1 = new HashMap<>();
  // map using hashmap
      m1.put(5,"Bimlesh");
      m1.put(2, "Satwesh");
      m1.put(7, "Sanjay");
      m1.put(10,"Zoya");
      m1.put(5, "Bimlesh");
      System.out.println(m1);
    //it prints the output in random order or assending order   
      
      Map<Integer, String> m2 = new TreeMap<>();
      // map using treemap
          m2.put(5,"Bimlesh");
          m2.put(2, "Satwesh");
          m2.put(7, "Sanjay");
          m2.put(10,"Zoya");
          m2.put(5, "Bimlesh");
          System.out.println(m2);
          //prints output based on assending order or based on thr key
      
	}

}
