package ex_23_Collection_Framework.Map;

import java.util.*;

public class Lab_084_Treemap {
    public static void main(String[] args) {
        Map<String,Integer> values = new TreeMap<>();
        values.put("Second",2);
        values.put("First",1);
        values.put("Third",3);
        System.out.println("TreeMap (sorted by keys): "+values);
    }
}
