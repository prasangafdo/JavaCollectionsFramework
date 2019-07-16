import java.util.*;

class pqueue{

	public static void main (String[] args){

		Queue<String> queue = new PriorityQueue<String>();

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

		for(String str: queue){//Using for each loop
			System.out.println("Added one "+str);
		}

	}
}