import java.util.*;

class queue{

	public static void main (String[] args){

		Queue<String> queue = new LinkedList<String>();

		queue.add("Prasanga");
		queue.add("Pubudu");
		queue.add("Sandun");
		queue.add("Kasun");
		queue.add("Sameera");
		queue.add("Pasindu");
		queue.add("Kavindu");
		queue.add("Lahiru");

		Iterator itr = queue.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		queue.offer("Sanduni");
		queue.offer("Geshala");
		queue.offer("Walgama");

		Iterator itr2 = queue.iterator();

		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

		queue.remove();//This will remove the first index by default. Becuause the queue is working as a FIFO type
		queue.remove("Walgama");//This will remove the specifically mentioned element.

		queue.poll();

		System.out.println("peek at: "+queue.peek());
		System.out.println("Current element is: "+queue.element());

		Iterator itr3 = queue.iterator();

		while(itr3.hasNext()){
			System.out.println("Itr3:"+itr3.next());
		}

	}
}