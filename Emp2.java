package Day6;

public class Emp2 {

	String name;
	int empID;
	String email;
	public Emp2(String empName, int employeeID,String emailID)
	{
		System.out.println("Cons Called");
		name= empName;
		empID = employeeID;
		email =emailID;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   Emp2 emp1 = new Emp2("Manali",11,"manali@gmail.com");
   Emp2 emp2 = new Emp2("Rakesh",22,"rakesh@yahoo.com");
   Emp2 emp3 = new Emp2("Krupa",33,"krupa@rediffmail.com");
   //emp1.displayEmpInformation();
   //emp2.displayEmpInformation();
  // emp3.displayEmpInformation();

   System.out.println(emp1.empID);
   System.out.println(emp2.email);
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
}//instance variables will be unique for  each and evry instance.
// atleast each person has different name ,ids are different
//each and every object have  certain value that will be different 
//for diff objects.the moment you create objectsthe values are assigned.
//if we havenot assingned any value it will take default values.