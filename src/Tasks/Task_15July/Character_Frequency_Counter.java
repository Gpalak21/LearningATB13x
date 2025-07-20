package Tasks.Task_15July;

import java.util.*;

public class Character_Frequency_Counter {
    public static void main(String[] args) {
        String string = "aabbccddeeff";
        Map<Character,Integer> freq = new HashMap();

        char[] ch = string.toCharArray();

        for(int i=0;i<ch.length;i++){
            char currentChar = ch[i];
            freq.put(currentChar,freq.getOrDefault(currentChar,0)+1);

        }

        System.out.println(freq);
    }
}
