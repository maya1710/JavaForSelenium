package day11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Map<Integer, String> m1 = new LinkedHashMap<>();
  
      m1.put(5,"Bimlesh");
      m1.put(2, "Satwesh");
      m1.put(7, "Sanjay");
      m1.put(10,"Zoya");
      System.out.println(m1);
      
      //in this the output will be the inserstion order
	}

}
