package Day10;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class SetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> s1 = new HashSet<>();
		s1.add("Prachi");
		s1.add("Ruchika");
		s1.add("Priya");
		s1.add("Shalini");
		
		//want to access all set values in index manner
		
		List<String> l1 = new ArrayList<>(s1);
		System.out.println(l1);
		System.out.println(l1.get(2));
		
	}
	

}
