//Carlos Elvir
package Assignment2;

import java.text.DecimalFormat;

/**
Part-time employee class
*/
public class PartTimeEmployee extends Employee{


private double payPerHour;
private int hoursWorked;

public PartTimeEmployee() {
	super();
	payPerHour = 0.0;
	hoursWorked = 0;
	
}

public PartTimeEmployee(String firstName, String lastName, double inPayPerHour, int hoursWorked) {
	super(firstName, lastName);
	payPerHour = inPayPerHour;
	this.hoursWorked = hoursWorked;
}
/** 
	Computes and returns the compensation
	@return compensation
*/
public double computeCompensation() 
{
	double compensation;
	compensation = payPerHour * hoursWorked;
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

	outStr = "\n\n\n\t\t\t" + "HEARTLAND CARS OF AMERICA" + "\n\n\n\t" 
	+ super.getFirstName() + " " + super.getLastName() + "\n\n\n" + "\n\tSalary/Hour \t$" + 
			currencyFormat.format(payPerHour) + "\n\tHours Worked \t " + hoursWorked + 
			"\n\tPay \t$" + currencyFormat.format(salary) + "\n\n\n\n"; 
	return outStr;
}



/**
	Accessor method for pay per hour
	@return pay per hour 
*/
public double getPayPerHour()
{
	return payPerHour;
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
	Mutator method for pay per hour
	@param inPayPerHour new value for pay per hour
*/
public void setPayPerHour (double inPayPerHour)
{
	payPerHour = inPayPerHour;
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
