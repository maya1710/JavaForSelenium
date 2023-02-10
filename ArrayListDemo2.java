package Day9;

import java.util.ArrayList;

public class ArrayListDemo2 {
	/*
	 * collection will take wrapper classes
	 * int -Integer
	 * double-Double
	 * char- Character
	 * float-Float
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList<String>jsAutomationTools= new ArrayList<>();
		jsAutomationTools.add("Cypress");
		jsAutomationTools.add("PlayWright");
		jsAutomationTools.add("WebDriverIO");
	
		
		ArrayList<String> automationTools= new ArrayList<>(jsAutomationTools);
		automationTools.add("Selenium");
		automationTools.add("Java");
		automationTools.add("Java");
		automationTools.add("Jenkins");
		System.out.println(automationTools);
		
		
	}

}
