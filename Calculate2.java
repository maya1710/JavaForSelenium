package Day6;

public class Calculate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Calculate2 obj1 = new Calculate2() ;
       
      int sum= obj1.sum(15, 12);
      int sub=obj1.sub(15, 12);
      int mul=obj1.mul(15, 12);
      int div=obj1.div(15, 12);
      String name=obj1.getName("Shalini", "Roy");
	
	
	System.out.println("Sum is "+ sum);
	System.out.println("Sub is "+ sub);
	System.out.println("Mul is "+ mul);
	System.out.println("Div is "+ div);
	System.out.println("Name is "+ name);
	}
    public String getName(String fname,String lName)
    {
     String result = fname+"  "+lName;
     return result;
    }
	
	public int sum(int n1,int n2)
	{
		int result = n1+n2;
		return  result;
	}
	public int sub(int n1,int n2)
	{
		int result = n1-n2;
		  return result;
	}
	public int mul(int n1,int n2)
	{
		int result = n1*n2;
		return result;
	}
	public int div(int n1,int n2)
	{
		int result = n1/n2;
		return result;
	}
}
// multiples objects can create under one class
//without storing we cant get the results