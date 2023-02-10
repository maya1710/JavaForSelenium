package Day7;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj1 =new MethodOverloading();
     obj1.add();
     obj1.add(15, 89);
     obj1.add(15, 7.5);
     obj1.add(12.76, 89);
     obj1.add(12.76, 7.5);
	}
  public void add()
  { 
	System.out.println("I am in add method");
  }
	
	public void add(int x,int y)
	{
		int result =x+y;
		System.out.println(result);
	}
	
	public void add(double x,double y)
	{
		double result =x+y;
		System.out.println(result);
	}
	public void add(int x,double y)
	{
		double result =x+y;
		System.out.println(result);
	}
	public void add(double x,int y)
	{
		double result =x+y;
		System.out.println(result);
	}
	
}
