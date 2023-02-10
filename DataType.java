package gettingstarted;

public class DataType {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      boolean status= false;
       System.out.println(status);
       char c1= 'a';
       System.out.println(c1);
       char c2= 70;
       System.out.println(c2);
       int marks =128;
       System.out.println(marks);
       //type castiong int to byte 
       //hence no need to declare again the variable only need to cast to byte
        marks = (byte)128;
       System.out.println(marks);
       short amount=32750;
       System.out.println(amount);
       int number=12345789;
       System.out.println("number");
       long phoneNumber=9535469289l;
       System.out.println("phoneNumber");
       float studentMarks=15.5f;
       System.out.println("StudentMarks");
       double teachersMarks= 20.5;
       System.out.println("teachersMarks");
	}

}
