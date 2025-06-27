package ex_04_if_condition;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lengths of triangle:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A==B)
        {
            if(B==C){
                System.out.println("Triangle is equilateral");
            } else {
                System.out.println("Triangle is isosceles");
            }
        }
        else if (B==C) {
            System.out.println("Triangle is isosceles");

        } else if (A==C) {
            System.out.println("Triangle is isosceles");

        } else {
            System.out.println("Triangle is scalene");
        }

    }
}
