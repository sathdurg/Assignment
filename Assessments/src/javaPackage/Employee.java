package javaPackage;

public class Employee {
	
	//Instance Variable
	
	String firstName = null;
	String lastName = null;
	double monthlySalary = 0.0;
	
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary>0)
		this.monthlySalary = monthlySalary;
	}
	
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public static double yearlySalary(Employee obj)
	{
		return 12*obj.getMonthlySalary();
	}
	
	public static double salaryAfterHike(Employee obj, double hike)
	{
		return 12*(obj.getMonthlySalary()+(obj.getMonthlySalary()*hike));
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Vijay", "Kumar", 20000);
		Employee emp2 = new Employee("Vikram", "Sanjay", 10000);
		
//		double yearlySalary = 12*emp1.getMonthlySalary();
		
		System.out.println("First Name:\t" + emp1.getFirstName() +"\nLast Name:\t" + emp1.getLastName());
		System.out.println("Yealy Salary:\t" +yearlySalary(emp1));
		System.out.println("--------------------------------------------");
		System.out.println("First Name:\t" + emp2.getFirstName() +"\nLast Name:\t" + emp2.getLastName());
		System.out.println("Yealy Salary:\t" +yearlySalary(emp2));
		
//		Salary after 10% raise
		
		System.out.println();
		System.out.println("Employee Vijay Salary after 10% Hike:\t" + salaryAfterHike(emp1, 0.1));
		System.out.println("Employee Vikarm Salary after 10% Hike:\t" + salaryAfterHike(emp2, 0.1));
		
		
		
		

	}

}
