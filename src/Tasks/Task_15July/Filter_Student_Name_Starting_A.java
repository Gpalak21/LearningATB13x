package Tasks.Task_15July;

import java.util.*;

public class Filter_Student_Name_Starting_A {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Anjali");
        map.put(102,"Dipak");
        map.put(103,"Aman");
        map.put(104,"Ravi");

//        List<String> list = new ArrayList<>();
        for(Map.Entry<Integer,String> i : map.entrySet()){
            if(i.getValue().startsWith("A")){
                System.out.println(i.getKey()+" -> "+i.getValue());
            }
        }
    }
}
