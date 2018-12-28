class A
{
void display()
{
System.out.println("A class mathod");
}
}
class B extends A
{
void display1()
{
System.out.println("B class method");
} 
}
class Inherit
{
public static void main(String args[])
{
A obj1=new A();
B obj2=new B();
obj1.display();
obj2.display1();
obj2.display();
}
}