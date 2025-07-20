package Tasks.Task_15July;

import java.util.*;

public class Word_Freqency_Counter_HashMap {
    public static void main(String[] args) {
            String s = "java is easy and java is powerful";
            String[] str = s.split(" ");
            Map<String,Integer> map = new HashMap<>();

            for(String s1: str){
                map.put(s1,map.getOrDefault(s1,0)+1);
            }

            for(Map.Entry<String,Integer> map1 : map.entrySet()){
                System.out.println(map1.getKey()+" -> "+map1.getValue());
            }



    }
}
