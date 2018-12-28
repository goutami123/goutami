import java.util.Scanner;
class Employee{
	int id;
	String name;
	float salary;
	Scanner obj=new Scanner(System.in);
	void read(){
		System.out.println("enter the id");
		id=obj.nextInt();
		System.out.println("enter name");
		name=obj.next();
		System.out.println("enter the salary");
		salary=obj.nextFloat();
	}
	void calsalary(){
		float hra,da,pf;
		hra=(10*salary)/100;
		da=(5*salary)/100;
		pf=(7*salary)/100;
		salary=salary+da+hra-pf;
	}
	void display(){
		System.out.println("Id is:"+id);
		System.out.println(name);
		System.out.println("salary is:"+salary);
	}
}
class Manger extends Employee{
	int numMgr;
	Address add=new Address();
	Scanner obj=new Scanner(System.in);
	void readMgr(){
		System.out.println("enter the number of employee");
		numMgr=obj.nextInt();
		add.readAdd();
	}
	void displayMgr(){
		System.out.println("number of employee is"+numMgr);
		add.displayAdd();
	}
}
class Address{
	String city;
	String state;
	Scanner obj=new Scanner(System.in);
	void readAdd(){
		System.out.println("enter the city");
		city=obj.next();
		System.out.println("enter the state");
		state=obj.next();
	}
	void displayAdd(){
		System.out.println(city);
		System.out.println(state);
	}
}

class EmpTest{
	public static void main(String args[]){
		Manger mgr=new Manger();
		mgr.read();
		mgr.readMgr();
		mgr.calsalary();
		mgr.display();
		mgr.displayMgr();
	}
}