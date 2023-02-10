package Day8;

public abstract class LoanCalc implements Calc 
{

	public static void main(String[] args)
	{
		//LoanCalc obj1= new LoanCalc();
	}

	@Override
	public void add()
	{
	 System.out.println("User Can Add");	
	}

	@Override
	public void sub() 
	{
		System.out.println("User Can Sub");
	}

	
	public abstract void mul();
	
	@Override
	public void div() 
	{
		System.out.println("User Can Div");
	}

}
