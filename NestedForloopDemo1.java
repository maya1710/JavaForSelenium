package day4;

public class NestedForloopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<2; i++)// outer loop running 2 times
		{
			
		
		        for (int j=0; j<10; j++) // inner loop running 10times
		        	
		         {
			        for(int k= 0;  k<2;k++) //inner loop 2 times
			        {
		        	
		        	System.out.println(i + " " + j +" " + k);
			        }
		         }
			
	     }

	}

}
