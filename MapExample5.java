package day11;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;


public class MapExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    
	 Map<Integer, String> m1 = new LinkedHashMap<>();
   //map using Linkedhashmap
      m1.put(8,"Bimlesh");
      m1.put(5, "Satwesh");
      m1.put(7, "Sanjay");
      m1.put(10,"Zoya");
      m1.put(null, "Bimlesh");
      m1.put(20, null);
       System.out.println("Map using LinkedHashMap "+m1);
    
      
      Map<Integer, String> m2 = new HashMap<>();
      // map using hashmap
          m2.put(8,"Bimlesh");
          m2.put(5, "Satwesh");
          m2.put(7, "Sanjay");
          m2.put(10,"Zoya");
          m2.put(null, "Bimlesh");
          m2.put(20, null);
        
          System.out.println("Map using HashMap " +m2);
          
       /* Map<Integer, String> m3 = new TreeMap<>();
          // map using Treemap
              m3.put(8,"Bimlesh");
              m3.put(5, "Satwesh");
              m3.put(7, "Sanjay");
              m3.put(10,"Zoya");
              m3.put(null, "Bimlesh");
              m3.put(20, null);
              System.out.println("Map using TreehMap "+m3);*/
              
          //null is not allowed in tree map it will give null pointer exception
	}

}
