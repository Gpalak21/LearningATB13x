package ex_02_UserInput;

import java.util.Scanner;

public class Lab005_UserInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");

        int age = scanner.nextInt();
        String canIVote = age > 18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
