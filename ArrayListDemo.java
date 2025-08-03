import java.util.ArrayList;

class ArrayListDemo{
    public static void main(String args[])
    {
        ArrayList <String> list =new ArrayList<>();

        list.add("Apple");
        list.add("Strawberry");
        list.add("Cherry");

        System.out.println(list);

        System.out.println(list.get(0));

        list.set(1,"Blueberry");

        System.out.println(list);

        list.remove("Blueberry");
        
        System.out.println(list);

        System.out.println(list.contains("Apple"));

        System.out.println(list.size());

        for(String item:list){
            System.out.println(item);
        }

        list.clear();
        System.out.println(list.isEmpty());
    }
}
            
