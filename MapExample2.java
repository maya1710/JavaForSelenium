package Day10;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Object> s1 =new HashMap<>();
		s1.put("id", 1);
		s1.put("name","Nishita");
        s1.put("status", false);
        s1.put("marks", 60);
        
        Map<String,Object> s2 =new HashMap<>();
		s2.put("id", 11);
		s2.put("name","Sarthak");
        s2.put("status", true);
        s2.put("marks", 72);
        
        Map<String,Object> s3 =new HashMap<>();
		s3.put("id", 15);
		s3.put("name","Saurav");
        s3.put("status", false);
        s3.put("marks", 65);
        
        //create one map which can accept key as integer and value as map
        Map<Integer, Map<String, Object>> allDeatails = new HashMap<>();
        allDeatails.put(1, s1);
        allDeatails.put(2, s2);
        allDeatails.put(3, s3);
        System.out.println(allDeatails.get(2));
        System.out.println(allDeatails.get(2).get("status"));
	}

}
