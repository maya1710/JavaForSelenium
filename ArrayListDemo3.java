package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp1 = new Employee(100, "Uma", "uma@gmail.com");
		Employee emp2 = new Employee(101, "Riyaa", "riyaa@gmail.com");
		Employee emp3 = new Employee(102, "Anshul", "anshul@gmail.com");
		
		
       ArrayList<Employee>myEmpList = new ArrayList<>();
       myEmpList.add(emp1);
       myEmpList.add(emp2);
       myEmpList.add(emp3);
       
       System.out.println(emp3.emailID);
       System.out.println(myEmpList.get(2).emailID);
       
       //List<Object>l1 =Arrays.asList(emp1,emp2,emp3);


	}

}
