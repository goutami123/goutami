import java.util.*;

class St5 {
	public static void main(String args[]){
	HashSet hs =new HashSet();
	System.out.println("Size is "+hs.size());
	System.out.println("Empty or not  "+hs.isEmpty());
	hs.add(30);	//auto-boxing : converting primitive to objects. 
	hs.add(10);
	hs.add(20);
	hs.add(40);
	System.out.println(hs);
	System.out.println("Size is "+hs.size());
	System.out.println("Empty or not  "+hs.isEmpty());
	System.out.println("Search "+hs.contains(20));
	System.out.println("Search "+hs.contains(200));
	hs.remove(30);
	System.out.println(hs);
	hs.clear();
	System.out.println(hs);
	System.out.println("Empty or not  "+hs.isEmpty());
	}
}