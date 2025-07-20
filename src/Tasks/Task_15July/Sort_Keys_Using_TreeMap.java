package Tasks.Task_15July;

import java.util.*;

public class Sort_Keys_Using_TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("Ravi",80);
        map.put("Anjali",95);
        map.put("Dipak",75);
        System.out.println("HashMap: "+map);

        Map<String,Integer> m2 = new TreeMap<>(map);
        System.out.println("Sorted by keys(TreeMap): "+m2);

    }
}
