package Day5;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	String msg="I love Automation,I can Automate Web Applications";
	
	String msg1="i love Automation,I can Automate Web Applications";
	
	System.out.println(msg.isEmpty());
	
	System.out.println(msg.startsWith("I"));
	
	System.out.println(msg.startsWith("i"));
	
	System.out.println(msg.endsWith("Applications"));
	
	System.out.println(msg.endsWith("applications"));
	
	System.out.println(msg.contains("love"));
	
	System.out.println(msg.equals(msg1));
	
	System.out.println(msg.equalsIgnoreCase(msg1));




	}

}
