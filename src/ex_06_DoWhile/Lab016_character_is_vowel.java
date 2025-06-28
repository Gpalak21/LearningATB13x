package ex_06_DoWhile;

import java.util.Scanner;

public class Lab016_character_is_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single character");
        String input = scanner.next();
        if(input.length()!=1)
        {
            System.out.println("Please enter only one character!");
        }
        else
        {
            char ch = scanner.next().toLowerCase().charAt(0);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is the vowel");
                } else {
                    System.out.println(ch + " is a consonent");
                }
            } else {
                System.out.println("Enter only characters");
            }
        }
    }
}
