/*class A {
	int a=10;
}
class B extends A {
	int b=20;
}
class Test3 {
	public static void main(String args[]){
	A obj1 =new A();		System.out.println(obj1.a);
	B obj2 = new B();		System.out.println(obj2.a);
				System.out.println(obj2.b);
	A obj3 = new B();	
				System.out.println(obj3.a);
				//System.out.println(obj3.b);
	B obj4 = obj2;
				System.out.println(obj4.a);
				System.out.println(obj4.b);
	
	//B obj4 = new A();
	}
}
*/
import java.util.Objects;
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
	@Override
	public boolean equals(Object obj){
	Employee emp =(Employee)obj;
	//if(this.id==emp.id && this.name.equals(emp.name) && this.salary==emp.salary) {
if(Objects.equals(this.id,emp.id) && Objects.equals(this.name,emp.name) && Objects.equals(this.salary,emp.salary)){
			return true;
		}else {
		return false;
		}
	}
}
class St2 {
	public static void main(String args[]){
	Object obj = new Employee();
	Employee emp1= new Employee(1,"Raj",12000);
	Employee emp2= new Employee(1,"Raj",12000);	
	//if(emp1==emp2) {
	if(emp2.equals(emp1)) {
		System.out.println("Equals");
	}else {
		System.out.println("Not Equals");
	}
	}
}