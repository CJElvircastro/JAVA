package Assignment2;

import java.text.DecimalFormat;

/**
Full-time employee class
*/
public class FullTimeEmployee extends Employee{

	
private double baseSalary;
private int hoursWorked;


public FullTimeEmployee() {
	super();
	baseSalary = 0.0;
	hoursWorked = 0;
	
}

public FullTimeEmployee(String firstName, String lastName, double totalBaseSalary, int totalHoursWorked) {
	super(firstName, lastName);
	baseSalary = totalBaseSalary;
	hoursWorked = totalHoursWorked;
}
/**
 	Computes and returns the compensation
 	@return compensation
*/
 public double computeCompensation()
 {
 	double compensation, payPerHour; 
 		
 	payPerHour = baseSalary / 80; 
 		
 if (hoursWorked > 80)
 {
	 compensation = baseSalary + (hoursWorked - 80) * 1.5 * payPerHour; 
 }
 else
 {
	 compensation = baseSalary;
 }
 	return compensation; 	
}
 	
/**	
Creates and returns a String for Paystub
@return paystub information 
*/
public String createPayStub() 
{
DecimalFormat currencyFormat = new DecimalFormat("0.00");
double salary; 

salary = computeCompensation();
String outStr;

outStr = "\n\n\n\t\t\t" + "HEARTLAND CARS OF AMERICA" + "\n\n\n\t" + 
		super.getFirstName() + " " + super.getLastName() + "\n\n\n"
		+ "\n\tBasic Salary \t$" + currencyFormat.format(baseSalary) + 
		"\n\tHours Worked \t " + hoursWorked + "\n\tPay \t$" + 
		currencyFormat.format(salary) + "\n\n\n\n";

return outStr; 
}


/** 
	Accessor method for base salary
	@return base salary 
*/
public double getBaseSalary() 
{
	return baseSalary;
}

/**
	Accessor method for hours worked
	@return hours worked
	*/
public int getHoursWorked()
{
	return hoursWorked;
}


/**
	Mutator method for base salary
	@param inputBaseSalary new value for base salary
	*/
public void setBaseSalary(double inputBaseSalary)
{
	baseSalary = inputBaseSalary;
}

/**
	Mutator method for hours worked
	@param inHoursWorked new value for hours worked
	*/
public void setHoursWorked (int inHoursWorked)
{
	hoursWorked = inHoursWorked;
}

/**
	toString method returns name as a string
	@return name of the customer
	*/
public String toString()
{
String str;
str = super.toString();
return str; 
}
}
