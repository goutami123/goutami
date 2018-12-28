import java.util.*;
class St16 {
	public static void main(String args[]){
	List ss = new ArrayList();
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
	//Iterator ii = ss.iterator();
	ListIterator ii = ss.listIterator();
	while(ii.hasNext()) {		
		System.out.println(ii.next());
	}
	System.out.println("Using ListIterator");
	while(ii.hasPrevious()) {		
		System.out.println(ii.previous());
	}
	}
}

