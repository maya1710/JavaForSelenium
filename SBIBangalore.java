package Day8;

public class SBIBangalore implements SBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RBI obj1= new SBIBangalore();
      obj1.deposit();
      obj1.withdraw();
      System.out.println("*******");
      SBI obj2 = new SBIBangalore();
      obj2.deposit();
      obj2.withdraw();
      obj2.loan();
      System.out.println("**********");
      SBIBangalore obj3=new SBIBangalore();
      obj3.deposit();
      obj3.loan();
      obj3.goldLoan();
      obj3.withdraw();
      }
    @Override
	public void deposit() 
	{
		System.out.println("SBI also provides deposit fac");
		
	}
    @Override
	public void withdraw() 
	{
		System.out.println("SBI also provides withdraw fac");
		
	}
    @Override
	public void loan() 
	{
		System.out.println("SBI Bangalore Provides Loan");	
	}
    public void goldLoan() 
	{
		System.out.println("SBI  Provides Gold Loan");	
	}
}
//we cant create object of interfaces.