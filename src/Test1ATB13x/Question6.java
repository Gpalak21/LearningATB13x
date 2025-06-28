package Test1ATB13x;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =scanner.nextInt();
        System.out.println("Enter second number:");
        int b =scanner.nextInt();
        System.out.println("Enter third number:");
        int c =scanner.nextInt();


        if(a>b || a==b){
            if(a>c||a==c){
                System.out.println("Largest number is: "+a);
            }
            else {
                System.out.println("Largest number is: "+c);
            }
        }
        else if(b>a){
            if(b>c || b==c){
                System.out.println("Largest number is: "+b);
            }
            else{
                System.out.println("Largest number is: "+c);
            }
        }
        else{
            System.out.println("Largest number is: "+c);
        }
    }
}
