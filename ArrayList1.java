import java.util.ArrayList;


class ArrayList1{
		public static void main(String args[])
{
	ArrayList<String> list = new ArrayList<>();

	list.add("afra");
	list.add("rose");
	list.add("mubass");

	System.out.print(list);

	System.out.println(list.get(2));

	list.set(2,"THAH");
	System.out.println(list);

	



	System.out.println(list.contains("afra"));

	System.out.println(list.size());

	for(String item:list){
		System.out.println(item);
	}
			list.clear();
			System.out.println(list.isEmpty());
}
	}

