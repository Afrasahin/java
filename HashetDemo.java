import java.util.*;

public class HashetDemo{
		public static void main(String args[])
{
	HashSet<String> set = new HashSet<>();

	set.add("apple");
	set.add("cherry");
	set.add("strawberry");
	System.out.println(set);


	HashSet<String> set1 =new HashSet<>(Arrays.asList("blueberry","banana"));
	set.addAll(set1);
	System.out.println(set1);


	System.out.println(set.contains("apple"));

	set.removeAll(Arrays.asList("cherry","banana"));
	System.out.println(set);

	set.remove("apple");
	System.out.println(set);

	System.out.println(set.isEmpty());

	System.out.println(set.size());
	if(set.contains("apple"))
	{
		System.out.println("set contains apple");
	}
	else if(set.contains("banana"))
	{
		System.out.println("set contains banana");
	}
	else{
		System.out.println("set does not contain apple");
	}
	

	Iterator<String> iterator = set.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	set.forEach(System.out::println);

	set.retainAll(Collections.singleton("apple"));

	System.out.println(set);

	set.clear();
	System.out.println(set);

	

}
}
