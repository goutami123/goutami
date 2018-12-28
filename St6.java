import java.util.*;

class St6 {
	public static void main(String args[]){
	//HashSet hs =new HashSet();
	//LinkedHashSet hs = new LinkedHashSet();
	TreeSet hs = new TreeSet();
	System.out.println("Size is "+hs.size());
	System.out.println("Empty or not  "+hs.isEmpty());
	hs.add("rakesh");	//auto-boxing : converting primitive to objects. 
	hs.add("rajiv");
	hs.add("Ram");
	hs.add("Raj");
	//System.out.println("Recod add "+hs.add(40));
	//System.out.println("Recod add "+hs.add(40));
	System.out.println(hs);
	System.out.println("Size is "+hs.size());
	System.out.println("Empty or not  "+hs.isEmpty());
	System.out.println("Search "+hs.contains("Raj"));
	System.out.println("Search "+hs.contains("Ram"));
	hs.remove("Ram");
	System.out.println(hs);
	hs.clear();
	System.out.println(hs);
	System.out.println("Empty or not  "+hs.isEmpty());
	}
}