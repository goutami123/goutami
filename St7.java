import java.util.*;
class Abc {
	public Set getSetObject() {
		//Set hs = new TreeSet();
		Set hs = new HashSet();
		//Set hs = new LinkedHashSet();
		hs.add(10);
		hs.add(20);
		return hs;
	}
}

class St7 {
	public static void main(String args[]){
	Abc obj = new Abc();
	Set hs=obj.getSetObject();	
	System.out.println(hs.size());
	}
}