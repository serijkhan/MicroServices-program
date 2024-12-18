package in.mantooit;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("john");
		queue.add("smith");
		queue.add("orlen");
		queue.add("charlie");
		
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		queue.remove();
		queue.poll();
	

}
}