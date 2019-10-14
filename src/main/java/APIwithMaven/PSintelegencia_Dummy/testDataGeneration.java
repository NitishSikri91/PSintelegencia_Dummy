package APIwithMaven.PSintelegencia_Dummy;

import java.io.IOException;

public class testDataGeneration {

	public static void main(String[] args) {
		//Please run this main program to generate the test data.
		//For now we are using this approach to run the main program but can be enhanced :)
		
		System.out.println("This program is generating the set of dummy test data.");
		
		try {
			generateData.Generate();
			System.out.println("Data generation successfull.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Refresh the project in eclipse and the output will be generate with Testdata.xlsx name");
		
		
	
	}
	
	
	
	
	
	
	
	
	
}
