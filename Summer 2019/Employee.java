public class Employee{

	protected String name;
	public Employee(String name){
		this.name= name; 
	}

	public Employee(){}

	//Accessor Method for Name 
	public String getName(){ 
 		return name; 
	}

	//Mutator method for Name
	public void setName(String name){
		this.name = name;

	}
}


class TestEmployee{
	public static void main(String [] args){
		Employee myEmployee = new Employee(); 

		System.out.println(myEmployee.getName());

		Employee newEmployee = new Employee("John");
		System.out.println(newEmployee.getName());
		//This next line gives an access error 
		//System.out.println(newEmployee.name);

		newEmployee.setName("James");
		System.out.println(newEmployee.getName());


	}
}

