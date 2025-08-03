import java.util.*;

class vectorSet{

                public static void main(String args[])

                {
                    Vector<String> set = new Vector<>();

                    set.add("apple");

                    set.add("orange");

                    set.add("cherry");

                    System.out.println(set);


                    Vector<String> anotherSet = new Vector<>(Arrays.asList("Strawberry","cucumber"));

                    set.addAll(anotherSet);

                    System.out.println(set.contains("apple"));

                    set.remove("orange");

                    set.removeAll(Arrays.asList("apple","cherry"));

                    System.out.println(set.isEmpty());

                    System.out.println(set.size());

                
                    Iterator<String> iterator = set.iterator();

                    while(iterator.hasNext())
                    {
                        System.out.println(iterator.next());
                    }
                        set.retainAll(Collections.singleton("apple"));

                        System.out.println(set);

                        set.clear();

                        System.out.println(set);

                        set.forEach(System.out::println);

                        if(set.contains("apple"))
                        {
                            System.out.println("yes");
                        }
                        else{

                            System.out.println("no");

                        }
                        
                }
}
		