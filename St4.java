import java.util.*;
class A{
	public String toString() {
		return "A class object";
	}
}
class B{
	public String toString() {
		return "B class object";
	}
}
class St4 {
	public static void main(String args[]){
	int a=10;		//primitive data types 
	float b=10.10f;
	String name="Raj";
	A obj1 = new A();
	B obj2 = new B();
	HashSet hs =new HashSet();
	Integer a1 = new Integer(a);	//converting primitive to integer object. 
	hs.add(a1);
	Float b1 = new Float(b);
	hs.add(b1);
	hs.add(name);
	hs.add(obj1);
	hs.add(obj2);
	System.out.println(hs);
	}
}