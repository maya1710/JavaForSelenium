package day11;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter number 1");
	int n1 = sc.nextInt();
	System.out.println("Enter number 2");
	int n2 = sc.nextInt();
	
	int result = n1/n2;
	
	System.out.println("Result is " +result);
	sc.close();
	}

}
