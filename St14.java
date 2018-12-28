import java.util.*;
class St14 {
	public static void main(String args[]){
	//HashMap hm = new HashMap();
	LinkedHashMap hm = new LinkedHashMap();
	//TreeMap hm = new TreeMap();
	hm.put(2,"Raj");
	hm.put(1,"Ravi");
	hm.put("Abc","Ramesh");
	hm.put(5,"Ramu");
	System.out.println(hm);
	hm.put(5,"Ajay");
	hm.put(6,"Raj");
	System.out.println(hm);
	if(hm.containsKey(6)){
		System.out.println("Key present");	
	}
	}
}

