package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

	try 
	{
		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2");
		int n2 = sc.nextInt();
	    int result = n1/n2;
	    System.out.println("Result is " +result);
	    
	}
	catch(ArithmeticException e)
		// TODO: handle exception
	{
		System.out.println("Hey body please dont give zero -Use positive numbers " +e.getMessage());
	}
   catch (InputMismatchException e) 
	{
	// TODO: handle exception
	   System.out.println("Hey body its calculator please provide numbers not string");
    }
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Something went wrong-we are working on it " +e.getMessage());
	}
	
	finally {
		
	    System.out.println("Closing the connection ......");
	    sc.close();
	    System.out.println("Connection Closed");
		System.out.println("Bye");
	}
	
	
	}
}
