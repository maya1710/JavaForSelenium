package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException2a {

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
	    sc.close();
	    System.out.println("Enter number 3");
	    int n3 = sc.nextInt();
	    System.out.println("Number 3 is "+ n3);
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
	/*catch (Throwable e) {
		// TODO: handle exception
		System.out.println("Something went wrong-we are working on it " +e.getMessage());
	}*/
// above catch statement will come below otherwisw it will give error becoz its a parent class of exception
	
	System.out.println("Bye");
	//if we reverse the order of last catch statement to first below two will throw error 
	//becoz its a dead code for java now ,its unreachable catchblock for arithmaticexception 
	//it is already handled by catch block for exception
	}

}
