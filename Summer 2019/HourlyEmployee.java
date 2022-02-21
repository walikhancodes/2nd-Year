

public class HourlyEmployee extends Employee{

	private double wage;
	private double hours;

	public HourlyEmployee(){}

	public HourlyEmployee(String name){
		super.name = name;	}

	public HourlyEmployee(String name, double wage, double hours){
		super.name = name;
		this.wage = wage;
		this.hours = hours;
 
	}

	public double getWage(){ return wage;}
	public void setWage(double wage){
		this.wage = wage;
	}
	public double getHours(){ return hours;}
	//@Override
	//public String getName(){ return "Hello";}
	@Override 
	public String toString(){ 
		return "Name: " + getName() + "\nWage: "+ wage + "\nHours: " + hours;
	}
	

}

class TestHourly{

	public static void main(String[] args){
		HourlyEmployee emp = new HourlyEmployee();
		System.out.println(emp.getName());

		HourlyEmployee emp2 = new HourlyEmployee("john");
		System.out.println(emp2.getName());

		HourlyEmployee emp3 = new HourlyEmployee("jane", 15.00, 40.00);
		System.out.println("Name: " + emp3.getName());
		System.out.println("Hours: " + emp3.getHours());
		System.out.println("Wage: " + emp3.getWage());

		Employee emp4 = new Employee("Mary");
		System.out.println(emp4.getName());

		//System.out.println(emp3.toString());
		System.out.println(emp3);
	}
}