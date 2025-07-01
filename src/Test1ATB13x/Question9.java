package Test1ATB13x;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.println("It's monday");
                break;

            case 2:
                System.out.println("It's Tuesday");
                break;

            case 3:
                System.out.println("It's Wednesday");
                break;

            case 4:
                System.out.println("It's Thursday");break;

            case 5:
                System.out.println("It's Friday");
                break;

            case 6:
                System.out.println("It's Saturday");
                break;

            case 7:
                System.out.println("It's Sunday");
                break;

            default:
                System.out.println("Invalid day number");
        }
    }
}
