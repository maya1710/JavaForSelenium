package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException2 {

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
	
	sc.close();
	System.out.println("Bye");
	//it means program is not getting terminated,it will continue the next set of statements
	//if you enter a string value incase of interger it will throw inputmismatchexception
	}

}
