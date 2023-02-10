package day11;

import java.util.Scanner;

public class HandleException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter number 1");
	int n1 = sc.nextInt();
	System.out.println("Enter number 2");
	int n2 = sc.nextInt();
	
	try 
	{
	 int result = n1/n2;
	 System.out.println("Result is " +result);
	}
	
	catch(ArithmeticException e)
		// TODO: handle exception
	{
		System.out.println("Hey body please dont give zero -Use positive numbers " +e.getMessage());
	}

	
	sc.close();
	System.out.println("Bye");
	//it means program is not getting terminated,it will continue the next set of statements
	
	}

}
