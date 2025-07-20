package Tasks.Task_15July;

import java.util.*;

public class Find_First_NonRepeated_Character {
    public static void main(String[] args) {
        String str ="aabbccdeeff";
        Map<Character,Integer> map = new HashMap<>();

        char[] ch = str.toCharArray();
       // System.out.println(ch);
        for(char c : ch ){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Character key:map.keySet()){
            if(map.get(key)==1){
                System.out.println("First non-repeated character is: "+key);
            }

        }

    }
}
