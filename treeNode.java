import java.util.*;

class treeNode{
                public static void main(String args [])
                {
                    TreeSet<String> tree = new TreeSet<>();

                    tree.add("apple");

                    tree.add("orange");

                    tree.add("cherry");

                    TreeSet<String> set = new TreeSet<>(Arrays.asList("Strawberry","fig"));

                    System.out.println(set);

                    System.out.println(set.contains("apple"));

                    System.out.println(set.isEmpty());

                    System.out.println(set.size());

                    set.remove("orange");
                    System.out.println(set);

                    set.removeAll(Arrays.asList("cherry","list"));

                    Iterator<String> iterator = set.iterator();

                    while(iterator.hasNext())
                    {
                        System.out.println(iterator.next());

                    }
                   set. forEach(System.out::println);

                   set.retainAll(Collections.singleton("apple"));
                   System.out.println(set);

                   set.clear();
                   System.out.println(set);

                }

                }

		