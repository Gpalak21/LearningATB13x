package ex_05_While_Loop;

import java.util.Random;
import java.util.Scanner;


public class Lab013_WhileCode {
    public static void main(String[] args) {
        Random random = new Random();
        int numToGuess= random.nextInt(100)+1; //0 to 100
        //System.out.println(numToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int guess;
        int attempts=0;
        while(true){
//            System.out.println("Enter another guess:");
            guess = scanner.nextInt();
            attempts++;

            if(guess<numToGuess){
                System.out.println("Too low, try again");
            } else if (guess>numToGuess) {
                System.out.println("Too high, try again");
                
            }
            else {
                System.out.println("correct! you gussed it in " + attempts + " attempts");
                break;
            }

        }
    }
}
