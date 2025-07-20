package Tasks.Task_15July;

import java.util.*;

public class Find_Most_Frequent_Char_In_String {
    public static void main(String[] args) {
        String str = "aaaabbbcc";
        char[] ch = str.toCharArray();
        int max =0;
        Character c2 = null ;

        Map<Character,Integer> map = new HashMap<>();

        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

        for(Map.Entry<Character,Integer> c1 : map.entrySet()){
            int i =c1.getValue();
            if(max<i){
                max = i;
                c2=c1.getKey();

            }
        }

        System.out.println("Most frequent character is: "+c2+" ("+max+" times)");

    }
}
