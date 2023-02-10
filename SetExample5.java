package Day10;

import java.util.Set;
import java.util.TreeSet;


public class SetExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer>s1 =new TreeSet<>();
		s1.add(200);
		s1.add(10);
		s1.add(18);
		s1.add(100);
		s1.add(300);
		s1.add(400);
		//s1.add(null);
		//s1.add(null);
	   //java does not allow null values when used treeset becoz of sorting
		System.out.println(s1);
		
		Set<String> s2 = new TreeSet<>();
		s2.add("javaa");
		s2.add("joya");
		s2.add("akhtar");
		s2.add("sujata");
		s2.add("balaji");
		
		System.out.println(s2);
	}
	

}
