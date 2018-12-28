import java.util.*;
class St12 {
	public static void main(String args[]){
	PriorityQueue pq = new PriorityQueue();
	pq.add(3);
	pq.add(2);
		pq.add(1);
	pq.add(4);
	pq.add(5);
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	}
}

