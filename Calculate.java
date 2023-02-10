package Day6;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculate obj1 = new Calculate() ;
       obj1.sum(15, 12);
       obj1.sub(15, 12);
       obj1.mul(15, 12);
       obj1.div(15, 12);
	}

	
	public void sum(int n1,int n2)
	{
		int result = n1+n2;
		System.out.println("Sum is "+result);
	}
	public void sub(int n1,int n2)
	{
		int result = n1-n2;
		System.out.println("Sub is "+result);
	}
	public void mul(int n1,int n2)
	{
		int result = n1*n2;
		System.out.println("Mul is "+result);
	}
	public void div(int n1,int n2)
	{
		int result = n1/n2;
		System.out.println("Div is "+result);
	}
}
// multiples objects can create under one class