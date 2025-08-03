import java.util.*;

class stack{
            public static void main(String args[])
            {
                Stack<String> stack = new Stack<>();

                stack.push("apple");

                stack.push("orange");

                stack.push("berry");

                System.out.println(stack);

                System.out.println(stack.peek());

                System.out.println(stack.pop());

                System.out.println(stack.search("apple"));

                System.out.println(stack.contains("orange"));

                System.out.println(stack.isEmpty());

                System.out.println(stack.size());

                Iterator<String> iterator = stack.iterator();
                while(iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }
                stack.forEach(System.out::println);

                stack.clear();

                System.out.println(stack);
            }
}