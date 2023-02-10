package Day5;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String msg="The Price is 100 USD";
		
		String []arr=msg.split(" ");
		
		System.out.println(arr[3]);
		
		int price=Integer.parseInt(arr[3]);
		if (price==100)
				
				{
			System.out.println("Pass");
				}
		else
		{ System.out.println("Fail");}
	}

} 
