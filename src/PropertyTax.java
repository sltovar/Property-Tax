//		PROPERTY TAX ASSESSMENT

import java.util.Scanner;

public class PropertyTax
{

	public static void main(String[] args)
    {
		//--------------------------------------------------------
		// USER INPUT/OUTPUT STATEMENTS
		// Scanner enables a program to read data from user input
		// Method nextDouble waits for the user to type the number
		// and press the enter key before submitting the number to
		// the program.
		//--------------------------------------------------------
		// Scanner and output for the Actual Value
		Scanner actualValueSc = new Scanner(System.in);
		System.out.print("Enter the actual value of the property: \n");
		double actualValue = actualValueSc.nextDouble();
		// Scanner and output for the Tax Rate
		Scanner taxRateSc = new Scanner(System.in);
		System.out.print("Enter the current tax rate (per $100): \n");
		double taxRate = taxRateSc.nextDouble(); 
		//-------------------------------------------
		// ADDITIONAL VARIABLE DECLARATION STATEMENTS
		//-------------------------------------------
		double assessValue = actualValue * 0.6;
		double propertyTax = (assessValue/100)*taxRate;
		//--------------------------------------------------------------
		// OUTPUT PRINT STATEMENTS
      // Displays the Property Value, Assessed Value, Tax Rate, and
     	// the Property Tax (to two decimal places)
		//--------------------------------------------------------------
       	System.out.printf("The Actual Value is:   %.2f%n", actualValue);
       	System.out.printf("The Assessed Value is: %.2f%n", assessValue);
       	System.out.printf("The Tax Rate is:       %.2f%n", taxRate);
       	System.out.printf("The Property Tax is:   %.2f%n", propertyTax);
    } 	// End of the main method

}
