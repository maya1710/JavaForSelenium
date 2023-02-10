package Day8;

public class Chrome implements WebDriver
{

	public static void main(String[] args) 
	{
		/*Chrome obj1=new Chrome();
		obj1.startBrowser();
		obj1.startApplication();
		obj1.savePassword();
		obj1.printPDF();
		obj1.closeBrowser();*/
		
		WebDriver obj1=new Chrome();
		System.out.println(obj1.name);
		System.out.println(WebDriver.name);
		obj1.startBrowser();
		obj1.startApplication();
		obj1.closeBrowser();
		
		//Object obj2= new Chrome();
		//WebDriver obj3= new WebDriver();
		//Chrome obj4=new WebDriver(;
		
	}
	public void printPDF()
	{
		System.out.println("Crome Can Generate PDF Files");
	}
	public void savePassword()
	{
		System.out.println("Chrome Can Save Password");
	}

	@Override
//whenever you have a method in base class exactly same as 
//child class called override
	public void startBrowser()
	{
		System.out.println("Start Chrome Browser");
	}

	@Override
	public void closeBrowser() 
	{
		System.out.println("Close Chrome Browser");
	}

	@Override
	public void startApplication()
	{
		System.out.println("Start Application In Chrome Browser");
	}

}
