//Carlos Elvir 
package Assignment2;

import java.util.*;

import java.io.*;


/**
	Modified program for Heartland Cars of America
*/
public class HeartlandCarsOfAmericaPayRollFileVersion
{
	public static void main (String[] args) throws FileNotFoundException, IOException
	{
		//Create reference variable of all three employee types
		
		FullTimeEmployee fullTimeEmployee;
		PartTimeEmployee partTimeEmployee;
		SalesEmployee salesEmployee;
		
		//Declare variables to input
		char inputEmployeeType;
		String inputFirstName;
		String inputLastName;
		double inputBaseSalary;
		double inputPayPerHour;
		int inputSalesVolume;
		int inputHoursWorked;
		
		//Create the variables for the averages statements.
		double fTPay = 0.0;
		double fTHours = 0;
		double pTPay = 0.0;
		double pTHours = 0;
		double sTPay = 0.0;
		double sTSalesVolume = 0;
		int f = 0;
		int p = 0;
		int s = 0;
		
		//Get two input values 
		Scanner scannedInfo = new Scanner (new File("C:\\users\\elvir\\employee.txt"));
			
			PrintWriter outFile = new PrintWriter (new FileWriter("C:\\users\\elvir\\payroll.txt")); 
		
		
		while (scannedInfo.hasNext()) {
			
		inputEmployeeType = scannedInfo.next().charAt(0);
		
			switch (inputEmployeeType)
			{
				case 'F' :
				case 'f' :
					//get necessary values as input
					
					inputFirstName = scannedInfo.next();
					inputLastName = scannedInfo.next();
					inputBaseSalary = scannedInfo.nextDouble();
					inputHoursWorked = scannedInfo.nextInt();
					
					//create an object and initialize data members
					
					
					fullTimeEmployee = new FullTimeEmployee(
							 inputFirstName,
							 inputLastName,
							 inputBaseSalary,
							 inputHoursWorked);

					//invoke the printPayStub method
					outFile.print (fullTimeEmployee.createPayStub());
				
					fTPay = fTPay + fullTimeEmployee.computeCompensation();
					fTHours = fTHours + inputHoursWorked;
					f = f + 1;
					
				break;
				
				case 'P' :
				case 'p' :
					//get necessary values as input
					inputFirstName = scannedInfo.next();
					inputLastName = scannedInfo.next();
					inputPayPerHour = scannedInfo.nextDouble();
					inputHoursWorked = scannedInfo.nextInt();
					
					//create an object and initialize data members
					
					partTimeEmployee = new PartTimeEmployee(
											inputFirstName,
											inputLastName,
											inputPayPerHour,
											inputHoursWorked);
					
					
					//invoke the printPayStub method
					outFile.print(partTimeEmployee.createPayStub());
					
					pTPay = pTPay + partTimeEmployee.computeCompensation();
					pTHours = pTHours	+	inputHoursWorked;
					p = p + 1;
				
				break; 
				
				case 'S' :
				case 's' :
					//get necessary values as input 
					inputFirstName = scannedInfo.next();
					inputLastName = scannedInfo.next();
					inputBaseSalary = scannedInfo.nextDouble();
					inputSalesVolume = scannedInfo.nextInt();
						
					//create an object and initialize data members
						
					salesEmployee = new SalesEmployee(
							inputFirstName,
							inputLastName,
							inputBaseSalary,
							inputSalesVolume);
					
					
					//invoke the printPayStub method
					outFile.print(salesEmployee.createPayStub());
					
					sTPay = sTPay + salesEmployee.computeCompensation();
					sTSalesVolume = sTSalesVolume + inputSalesVolume;
					s = s + 1;
					
				break;
			}			/**End of switch
			*/
			
		}				// End of while
		
		System.out.println("Average full-time employee base salary = $" + fTPay/f);
		System.out.println("Average part-time employee pay per hour = $" + pTPay/p);
		System.out.println("Average sales employee base salary = $" + sTSalesVolume/s);
		
		scannedInfo.close();
		outFile.close();
	}					// End of main
}						// End of class
