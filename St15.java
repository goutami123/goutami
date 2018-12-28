import java.util.*;
class St15 {
	public static void main(String args[]){
	Set ss = new HashSet();
	ss.add(3);		// auto-boxing 
	ss.add(1);
	ss.add(2);
	ss.add(4);
	System.out.println(ss);
	System.out.println("Using normal form loop");
	/*for(int i=0;i<ss.size();i++){
		System.out.println(ss);
	}*/
	System.out.println("Using for each loop");
	for(Object a:ss) {
		System.out.println(a);
	}
	System.out.println("Using Iterator");
	Iterator ii = ss.iterator();
	while(ii.hasNext()) {		
		System.out.println(ii.next());
	}
	}
}

