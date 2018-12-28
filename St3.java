class Employee {
	private int id;
	private String name;
	private float salary;
	Employee() {}
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("Id is" +id+ "name is" +name+ "salary is" +salary);
		}
	
	@Override
	public String toString() {
	return "Id is "+id+" Name is "+name+" Salary is "+salary;
		//return "Employee object";
	}
}
class St3 {
	public static void main(String args[]){
	Employee emp1= new Employee(1,"Raj",12000);
	Employee emp2= new Employee(2,"Rajvi",14000);	
	System.out.println(emp1);
	System.out.println(emp2);
	}
}