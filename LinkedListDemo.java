import java.util.LinkedList;

class LinkedListDemo{
		public static void main(String args[])
{
	LinkedList<Integer> list = new LinkedList<>();

	list.addFirst(17);
	System.out.println(list);
	list.addLast(20);
	System.out.println(list);
	list.add(1,21);
	System.out.println(list);


	list.removeFirst();
	System.out.println(list);

	list.removeLast();
	System.out.println(list);

	list.add(1,25);
	System.out.println(list);

	list.add(35);
	System.out.println(list);

	boolean found = list.contains(20);
	System.out.println(found);

	LinkedList<Integer> reversedlist = new LinkedList();
	for(int i=list.size()-1;i>=0;i--)
	{
		reversedlist.add(list.get(i));
	}
	System.out.println(list);

	
}
}

	