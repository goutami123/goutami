import java.util.*;
class St9 {
	public static void main(String args[]){
	Stack ss = new Stack();
	ss.push(100);
	ss.push(200);
	ss.push(300);
	ss.push(400);
	System.out.println(ss);
	System.out.println(ss.pop());	//top most element 
	System.out.println(ss);
	System.out.println(ss.peek());	//display only top most element 
	System.out.println(ss);
	System.out.println(ss.search(300));	//300 position is 1, count start from top  
	System.out.println(ss.search(100));	//100 position is 3
	System.out.println(ss.search(3000));
	System.out.println(ss.search(10));
	}
}