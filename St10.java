import java.util.*;
class St10 {
	public static void main(String args[]){
	// int abc[]={10,20,30,40};	200
	// int abc[]=new int[10];
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(40);
	al.add(50);
	al.remove(2);	//remove using index position 
	System.out.println(al);	
	System.out.println("Postion value "+al.get(1));
	al.add(1,100);
	System.out.println(al);
	System.out.println("Postion value "+al.get(1));
	al.remove(new Integer(50));	//remove using value 
	System.out.println(al);
	}
}