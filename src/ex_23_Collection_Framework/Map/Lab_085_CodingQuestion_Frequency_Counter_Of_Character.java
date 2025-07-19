package ex_23_Collection_Framework.Map;

import java.util.*;

public class Lab_085_CodingQuestion_Frequency_Counter_Of_Character {
    public static void main(String[] args) {
        String input ="Programming";

        Map<Character,Integer> freq = new HashMap<>();
        for(char c: input.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        System.out.println(freq);
    }


}
