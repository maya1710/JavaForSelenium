package Day10;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "Rashi");
		m1.put(11, "Viveka");
		m1.put(21, "Ishita");
		m1.put(31, "Harsh");
		
		System.out.println(m1);
		System.out.println(m1.get(11));
		System.out.println(m1.get(41));
		
		System.out.println(m1.containsKey(31));
		System.out.println(m1.containsKey(51));
		
		System.out.println(m1.containsValue("Rashi"));
		System.out.println(m1.containsValue("viveka"));
		
		System.out.println(m1.size());
		System.out.println(m1.remove(21));
		System.out.println(m1.size());
	}

}
