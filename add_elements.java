// Java code to add elements to a PriorityQueue

import java.util.*;
import java.io.*;

public class PriorityQueueDemo {

	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println(pq);
	}
}
