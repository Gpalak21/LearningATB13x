package ex_05_While_Loop;

import java.util.Scanner;

public class Lab012_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program \n Enter the number:");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the integer your fool.");
            return;
        }
        int number = scanner.nextInt();

        int fact = 1;

        if(number <0)
        {
            System.out.println("Negative factorial is not allowed.");
        }
        else if(number==0)
        {
            System.out.println(fact);
        }
        else {
            for(int i =1;i<=number;i++){
                fact = fact * i;
            }
            System.out.println(fact);
        }

    }
}
