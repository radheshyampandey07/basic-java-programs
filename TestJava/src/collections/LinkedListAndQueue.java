package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListAndQueue {

	public static void main(String[] args) {

		int[] arr = { 10, 12, 1, 2, 4, 7, 9, 90, 89, 87 };

		/*----------------------- Linked List ----------------------- */

		List<Integer> list = new LinkedList<>();

		// convert an array to a Linked List
		for (int num : arr)
			list.add(num);
		System.out.print("linked list ->  " + list);
		System.out.println();

		/*----------------------- Priority Queue ----------------------- */

		Queue<Integer> newData = new PriorityQueue<>();

		// convert an array to a Priority Queue
		for (int num : arr)
			newData.add(num);
		// by default in Priority Queue first element is lowest element of the list
		System.out.println("priority queue -> " + newData);

		// this way you can get nth Largest number in an array
		for (int i = 0; i < 4; i++)
			System.out.println(newData.poll());
		System.out.println("priority queue after poll -> " + newData);

		
		Queue<String> data = new LinkedList<>();
		
		// add a value in Queue
		data.offer("Hi");
		data.offer("hello");
		data.offer("How");
		data.offer("Hi");
		data.offer("hello");
		data.offer("How");
		System.out.println(data);

		System.out.println(data.poll());
		System.out.println(data);
		System.out.println(data.peek());
	}

}
