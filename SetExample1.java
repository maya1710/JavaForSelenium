package Day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>studentsName = new ArrayList<>();
		studentsName.add("Narendra");
		studentsName.add("Narendra");
		studentsName.add("Sonali");
		studentsName.add("Jagdeesh");
		studentsName.add("Uma");
		studentsName.add("Uma");
		
		//First way
		HashSet<String> s1 = new HashSet<>(studentsName);
		//System.out.println(s1);
		
		//Second way
		HashSet<String> s2 = new HashSet<>();
		s2.addAll(s1);
		s2.add("Bimlesh");
		s2.add("Saurav");
		System.out.println(s2);
		
	}
	

}
