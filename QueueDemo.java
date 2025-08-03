import java.util.*;

class QueueDemo{

		public static void main(String args[])
{
	Queue <String> queue = new LinkedList<>();
	queue.add("apple");
	queue.offer("banana");
	queue.offer("cherry");
	System.out.println(queue.poll());

	System.out.println(queue.peek());

	System.out.println(queue.contains("apple"));

	System.out.println(queue.isEmpty());

	System.out.println(queue.size());

	if(queue.contains("apple"))
	{
		System.out.println("queue contains apple");
	}
	else if(queue.contains("banana")&& queue.contains("cherry"))
	{
		System.out.println("queue contains banana" + " " + "cherry");
	}
	else if(queue.contains("banana")|| queue.contains("cherry"))
	{
		System.out.println("queue contains banana or cherry");
	}


	Iterator<String> iterator = queue.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	queue.forEach(System.out::println);

	System.out.println();

	if(queue.equals("apple"))
	{
		System.out.println("apple is added");
	}
	else {
		System.out.println("apple is not added");
	}

	queue.clear();
	System.out.println(queue);

	System.out.println();

}
}