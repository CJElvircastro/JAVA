package Assignment2;

public abstract class Employee {

	private String firstName;
	private String lastName;
	
	/** Employee Constructor
	 * 
	 */
	
	public Employee() {
		this.firstName = "";
		this.lastName = "";
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/** Method to compute and return compensation
	 * 
	 */
	public abstract double computeCompensation(); 
	
	
	public abstract String createPayStub();
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String inFirstName) {
		firstName = inFirstName;
	}
	
	public void setLastName(String inLastName) {
		lastName = inLastName;
	}
	
	public String toString() {
		String str;
		str = firstName + " " + lastName;
		
		return str;
	}
}
