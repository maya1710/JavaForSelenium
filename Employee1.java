package Day6;

public class Employee1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee1 anaya = new Employee1();
		anaya.dev();//calling dev method
		anaya.automationEngg();//calling automationEngg
		anaya.devOPsEngg();//calling devOpsEngg method
		
//whenever we have non static members in order to call them we 
//have to use objects using dot operator.
		
	}
	
	public void devOPsEngg()
	
	{
		System.out.println("I am into devOps role");
		
	}
	public void automationEngg()
	{
		System.out.println("I can automate testcases");
	}
	public void dev()
	{
		System.out.println("I can write codes");
		
	}
}
//the above 3 methods are non static so inoder to call them we
//use objects using dot operator
// main method will have to  loaded first
//one methods cant write in another method means nested
//methods cant be written 