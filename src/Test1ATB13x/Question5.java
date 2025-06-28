package Test1ATB13x;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a =scanner.nextInt();
        if(a>0){
            System.out.println(a+" is positive");
        }
        else if(a<0){
            System.out.println(a+" is negative");
        }
        else{
            System.out.println(a+" is zero");
        }
    }
}
