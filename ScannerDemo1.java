package day11;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1 = 10;
		int n2 = 5;
		int result = n1/n2;
		System.out.println("Result is " +result);
		
        int []arr = new int [2];
        arr[0] = 12;
        arr[1] = 23;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        
        //System.out.println(arr[2]);
		// it will give arrayindexoutof bound exception if i run the above statement
        
       /* String name ="Mukesh";
        System.out.println(name.charAt(10));*/
        
        //it will give StringIndexOutofbound exception
        
        //Thread.sleep(2000);
        //these are compile time exception.this is unhandled exception called intrupted exception.
        //It will not allow you to compile untill you handle it.
	}

}
