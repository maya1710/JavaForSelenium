package Day6;

public class Employee3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee3 anaya = new Employee3();
		anaya.dev();
		Employee3 shalini = new Employee3();
		shalini.devOpsEngg();
		Employee3 jagdeesh = new Employee3();
		jagdeesh.automationEngg();
		Employee3 uma = new Employee3();
		uma.projectManager();
	}
	
	public void devOpsEngg()
	
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
	
  public void projectManager()
  {
	  System.out.println("I am into PM role");
  }
  
}
//from one method you can call another method ,
//But you cant write one method inside another method
//its happening without creating object and 
//its happening using this keyword