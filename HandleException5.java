package day11;

public class HandleException5 {
	
	public static void main(String[] args)
	
	{
		int age =15;
		
		try {
			
			validate(age);
		} 
		catch (InvalidAgeException e)
		{
			// TODO: handle exception
			System.out.println("Exception " +e.getMessage());
		}
		
	}
	
	public static void validate(int age) throws InvalidAgeException
	
	{
		if(age<18)
		{
			throw new InvalidAgeException("Focus On study");
			
		}
		else 
		{
			System.out.println("Welcome to club");
		}
	}

}
