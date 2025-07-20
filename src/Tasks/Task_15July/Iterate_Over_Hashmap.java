package Tasks.Task_15July;

import java.util.*;

public class Iterate_Over_Hashmap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("Name","Dipak");
        map.put("Role","Tester");
        map.put("Level","Senior");

        //Using key Set
        System.out.println("Iterating using KeySet-------");
        for(Object key : map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }

        //Using Iterator
        System.out.println("Iterating using Iterator-------");
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        //Using Entry Set
        System.out.println("Iterating using Entry Set--------");
        for(Map.Entry<String,String> item : map.entrySet()){
            System.out.println(item.getKey()+" -> "+item.getValue());
        }

    }
}
