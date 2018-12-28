import java.util.*;
class St11 {
	public static void main(String args[]){
	// int abc[]={10,20,30,40};	200
	// int abc[]=new int[10];
	LinkedList al = new LinkedList();
	al.add(2);
	al.add(20);
	al.add(30);
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
	al.addFirst(1000);
	al.addLast(2000);
	System.out.println(al);
	al.removeFirst();
	al.removeLast();
	System.out.println(al);
	}
}

