class Employee
{
int id;
String name;
double salary;

Employee passobject(Employee emp1)
{
System.out.println(emp1.id+" "+emp1.name+" "+emp1.salary);
emp1.id=12;
emp1.name="raj";
emp1.salary=13000;
return emp1;
}
}
class EmployeeTest
{
public static void main(String args[])
{
Employee emp1=new Employee();
emp1.id=13;
emp1.name="ravi";
emp1.salary=12000;
emp1.passobject(emp1);
Employee emp2=emp1.passobject(emp1);
	System.out.println(emp2.id);
	System.out.println(emp2.name);
	System.out.println(emp2.salary);
}
}