import java.util.*;

class queue1{
            public static void main(String args[])
            {
                Queue<String> queue = new LinkedList<>();

                queue.offer("afra");

                queue.offer("sahin");

                queue.offer("M");

                System.out.println(queue);

                System.out.println(queue.peek());

                System.out.println();

                System.out.println(queue.peek());

                System.out.println();

                System.out.println(queue.size());

                System.out.println();

                System.out.println(queue.contains("afra"));

                System.out.println();

                System.out.println(queue.isEmpty());

                System.out.println();

                Iterator<String> iterator = queue.iterator();

                while(iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }

                queue.clear();

                System.out.println();

                Queue<Integer> queues =new LinkedList<>();

                queues.add(123);

                queues.add(321);

                queues.add(456);

                System.out.println(queues);

                System.out.println(queues.size());

                System.out.println();

                System.out.println(queues.contains(123));

                System.out.println();

                queues.clear();

                System.out.println(queues);

                if(queues.equals(123))
                {
                    System.out.println("Its equal");
                }
            else
            {
                System.out.println("not equals");
            }
            }
}
        

