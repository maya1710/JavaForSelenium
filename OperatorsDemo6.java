package gettingstarted;

public class OperatorsDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int mark =68;
	      
				if(mark>=90)
					
				{
					System.out.println("A++ Grade");
				}
			
			     else  if (mark<=90 && mark>=80)
			    	 
			    {
				     System.out.println("A Grade");
			    }
			   
			    else if(mark<=80 && mark>=60) 
			   {
			        System.out.println("B Grade");
			   }
			    else if(mark<=60 && mark>=30)
			    {
			    	System.out.println("C Grade");
			    }
			    else if(mark<35)
			    {
			    	System.out.println("Fail");
			    }
	}

}
