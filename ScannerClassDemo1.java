package Day7;

import java.util.Scanner;

public class ScannerClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc= new Scanner(System.in);
		//System.in means take input from the keyboard.
		
		System.out.println("Please enter number 1");
		int n1=sc.nextInt();
		System.out.println("Please enter number 2");
		int n2=sc.nextInt();
		System.out.println("Please enter number 3");

		int n3=sc.nextInt();
		int result=n1+n2+n3;
		sc.close();
	
		System.out.println("Result is" + result);
		
		
	}

}
