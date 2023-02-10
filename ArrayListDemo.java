package Day9;

import java.util.ArrayList;

public class ArrayListDemo {
	/*
	 * collection will take wrapper classes
	 * int -Integer
	 * double-Double
	 * char- Character
	 * float-Float
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		//ArrayList obj1 = new ArrayList();
//when we dont provide any generics by default this arraylist will consider 
	//	each and everything as object
		
		ArrayList<String> automationTools= new ArrayList<>();
		automationTools.add("Selenium");
		automationTools.add("Java");
		automationTools.add("Java");
		automationTools.add("Jenkins");
		System.out.println(automationTools);
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(20);
		System.out.println("List with Integer "+marks);
		
		ArrayList<Double> marksNew = new ArrayList<>();
		marksNew.add(10.20);
		marksNew.add(15.29);
		System.out.println("List with Double "+marksNew);
		
		
	}

}
