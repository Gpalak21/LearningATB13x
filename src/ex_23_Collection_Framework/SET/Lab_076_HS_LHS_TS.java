package ex_23_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_076_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        hs.add(null);

        for(String s:hs){
            System.out.println(s);
        }

        System.out.println(hs);

        System.out.println("------------");

        Set lhs = new LinkedHashSet();

        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add("null");
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("-----------------------");
        System.out.println("TREE SET---------------");

        Set ts = new TreeSet();
        ts.add("Apple");
        ts.add("Pineaple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Watermelon");
        ts.add("Watermelon");
       // ts.add("null");
       // ts.add(123);
        ts.add("apple");

        System.out.println(ts);

    }
}
