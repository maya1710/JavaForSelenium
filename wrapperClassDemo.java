package Day9;

public class wrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a = 10;
	//  a is just a normal variable which is holding a value of 10
	System.out.println(a);
	
   Integer b = 100;
   //b is a reference variable of integer class which is holding
	//a value of 100. using b. you can called all the method of integer class
   System.out.println(b);
   
   String price1 ="100";
   
    int a1 =Integer.parseInt(price1);
   
   String price2 ="200";
    int b1 =Integer.parseInt(price2);
   
   System.out.println(price1+price2);
   //both are string thats why its doing concatenation
   System.out.println(a1+b1);
	}

}
