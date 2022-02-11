//Carlos Elvir
package Assignment2;

import java.text.DecimalFormat;

/**
Sales employee class 
*/
public class SalesEmployee extends Employee{
	

private double baseSalary;
private double salesVolume; 

public SalesEmployee() {
	super();
	baseSalary = 0.0;
	salesVolume = 0;
	
}

public SalesEmployee(String firstName, String lastName, double inBaseSalary, double salesVolume) {
	super(firstName, lastName);
	baseSalary = inBaseSalary;
	this.salesVolume = salesVolume;
}
/**
Computes and returns the compensation
@return compensation
*/
public double computeCompensation()
{
double compensation;

compensation = baseSalary + 0.02 * salesVolume; 

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
super.getFirstName() + " " + super.getLastName() + "\n\n\n" +
"\n\tBasic Salary \t$" + currencyFormat.format(baseSalary) + 
"\n\tSales Volume \t$" + currencyFormat.format(salesVolume) + 
"\n\tPay \t$" + currencyFormat.format(salary) + "\n\n\n\n"; 
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
	Accessor method for sales volume
	@return sales volume
*/
public double getSalesVolume()
{
	return salesVolume;
}

/**
Mutator method for Base Salary
@param inputBaseSalary new value for base salary 
*/
public void setBaseSalary(double inputBaseSalary)
{
	baseSalary = inputBaseSalary;
}

/**
Mutator method for sales volume
@param inSalesVolume new value for sales volume
*/
public void setSalesVolume(double inSalesVolume)
{
	salesVolume = inSalesVolume;
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