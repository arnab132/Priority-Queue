// Java code to access elements from a PriorityQueue

import java.util.*;

class PriorityQueueDemo {

	// Main Method
	public static void main(String[] args)
	{

		// Creating a priority queue
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");
		System.out.println("PriorityQueue: " + pq);

		// Using the peek() method
		String element = pq.peek();
		System.out.println("Accessed Element: " + element);
	}
}
