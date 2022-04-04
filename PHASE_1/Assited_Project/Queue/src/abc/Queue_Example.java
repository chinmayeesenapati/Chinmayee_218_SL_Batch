package abc;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example 
{
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	locationsQueue.add("Khurdha");
	        		locationsQueue.add("Puri");
	        		locationsQueue.add("Bhubaneswar");
	        		locationsQueue.add("Cuttack");
	        		locationsQueue.add("Balesore");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
	}