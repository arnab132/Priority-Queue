// Java program to iterate elements to a PriorityQueue

import java.util.*;

public class PriorityQueueDemo {

	// Main Method
	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		Iterator iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
