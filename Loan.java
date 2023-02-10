package Day7;

public class Loan extends Calc
{
   public Loan()
   {
	 System.out.println("Child class cons");
   }
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   Loan l1 = new Loan();
  /* l1.calHomeLoan();
   l1.calPersonalLoan();
   l1.div();
   l1.sum();
   System.out.println("*************");
   Calc l2 =new Calc();
   l2.sum();
   l2.div();
   System.out.println("*************");
   Calc l3= new Calc();
   l3.div();
   l3.sum();
   System.out.println("***************");
   //Loan l4 =new Calc();
   */
	}

	public void calPersonalLoan()
	{
		System.out.println("Personal loan calc");
	}
	public void calHomeLoan()
	{
		System.out.println("Home loan calc");
	}
}
