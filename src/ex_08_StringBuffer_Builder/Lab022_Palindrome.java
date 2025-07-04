package ex_08_StringBuffer_Builder;

import java.util.Scanner;

public class Lab022_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.next();

        String string_reverse = reverse_string(input);

        if(string_reverse.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not-Palindrome");
        }

    }

    static String reverse_string(String userInput){
        String reverse="";
        for(int i=userInput.length()-1;i>=0;i--){
            reverse = reverse+userInput.charAt(i);
        }
        return reverse;
    }

    static String reverse_string_SB(String userInput){
        StringBuilder reverse_input = new StringBuilder(userInput);
        return reverse_input.reverse().toString();
    }
}
