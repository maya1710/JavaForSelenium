package day11;

import java.io.File;


public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myFile = new File("./properties/Config.properties");
		System.out.println(myFile.canRead());
		
		System.out.println(myFile.canExecute());
		System.out.println(myFile.getName());
		//myFile.delete();
     
		

	}

}
