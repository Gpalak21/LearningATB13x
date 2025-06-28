package ex_06_DoWhile;

import java.util.Scanner;

public class Lab017_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");


        if(!(scanner.hasNextInt())){
            System.out.println("Enter integer value you fool!");
            return;
        }
        else{
            int year = scanner.nextInt();
        if(year<=0){
            System.out.println("please enter correct year");
        }
        else {
            if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
        }
}
