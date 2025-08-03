import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
                    public static void main(String args[]){
                    HashMap<Integer , String> map = new HashMap<>();

                    map.put(1,"apple");
                    map.put(2,"orange");
                    map.put(3,"pineapple");


                    System.out.println(map);
                    System.out.println();

                    System.out.println(map.get(2));
                    System.out.println();
                
                        
                    map.remove(3);
                    System.out.println(map);
                    System.out.println();
        
                    System.out.println(map.containsKey(1));
                    System.out.println();
                    System.out.println(map.containsValue("orange"));
                    System.out.println();
                    if(map.containsValue("apple"))
                    {
                        System.out.println("yes");
                    
                    }
                    
                    else if(map.containsKey(4))
                    {
                        System.out.println("yes");
                    }
                    else{
                        System.out.println("no");

                    }
                    System.out.println(map.replace(2,"pineapple"));
                    for(Integer key:map.keySet())
                    {
                        System.out.println("key:"+key+",value: "+map.get(key));
                    }
                    System.out.println();
                    System.out.println(map.size());
                    System.out.println();
                    map.clear();
                    System.out.println(map);
                    System.out.println(map.isEmpty());
    
            }
            }

