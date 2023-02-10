package Day10;

import java.util.LinkedHashSet;

import java.util.Set;


public class SetExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer>s1 =new LinkedHashSet<>();
		s1.add(200);
		s1.add(10);
		s1.add(18);
		s1.add(100);
		s1.add(300);
		s1.add(400);
		s1.add(null);
		s1.add(null);
		//linkedhashset maintains the inserttion order
		System.out.println(s1);
	}
	

}
