package Day6;

public class Emp {

	String name;
	int empID;
	
	public Emp(String empName, int employeeID)
	{
		System.out.println("Cons Called");
		name= empName;
		empID = employeeID;
		
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   Emp emp1 = new Emp("Manali",11);
   Emp emp2 = new Emp("Rakesh",22);
   Emp emp3 = new Emp("Krupa",33);
   //emp1.displayEmpInformation();
   //emp2.displayEmpInformation();
  // emp3.displayEmpInformation();

   System.out.println(emp1.empID);
   System.out.println(emp2.empID);
   System.out.println(emp3.name);
    
   }

	public void displayEmpInformation() 
	{
		System.out.println("Name is " +name);
		System.out.println("EmpID is " +empID);
	}
	
	public void logIn()
	{
		System.out.println("Emp has to login");
		
	}
	public void logOut()
	{
		System.out.println("Emp has to logout");
		
	}
}
//if we havenot assingned any value it will take default values.