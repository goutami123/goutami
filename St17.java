import java.util.*;
class St17 {
	public static void main(String args[]){
	/*List ss = new ArrayList();
	ss.add(3);		// auto-boxing 
	ss.add("Raj");
	ss.add(20.10f);
	ss.add(4);
	
	Object obj = ss.get(1);
	Integer i = (Integer)obj;
	int n= i.intValue();		//converting integer object to primitive
	System.out.println(n);*/
	//Collection framework with Generics 
	//List<Type> obj = new Arraylist<Type>();	type may be Integer, Float, String, Employee 
	
	List<Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(12);
		obj.add(24);
		
	int n=obj.get(1);		//auto-unboxing : converting object to primitive 
	System.out.println(n);
	}
}


