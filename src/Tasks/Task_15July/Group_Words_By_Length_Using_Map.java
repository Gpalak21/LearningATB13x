package Tasks.Task_15July;

import java.util.*;

public class Group_Words_By_Length_Using_Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("fun");
        list.add("cool");
        list.add("Hi");

//      System.out.println(list);

        Map<Integer,List<String>> m1 = new HashMap<>();

        for( String s :list ){
            int length = s.length();
            if(!m1.containsKey(length)){
                m1.put(length,new ArrayList<>());
            }
            m1.get(length).add(s);
        }

        for(Integer key : m1.keySet()){
            System.out.println(key + " -> "+m1.get(key));
        }

    }
}
