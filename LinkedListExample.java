package Day9;

import java.util.LinkedList;


public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList<String> myList= new LinkedList<>();
		
       
		 myList.add("Aro");
		 myList.add("Dopa");
		 myList.add("Marko");
		 myList.add("Jim");
		 
		 System.out.println(myList);
		 myList.addFirst("Abhishek");
		 
		 System.out.println(myList);
		 myList.addLast("Abhishek");
		 
		 System.out.println(myList );
		 myList.removeFirst();
		 
		 System.out.println(myList );
	}

}
