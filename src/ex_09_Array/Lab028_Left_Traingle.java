package ex_09_Array;

import java.util.Scanner;

public class Lab028_Left_Traingle {
    public static void main(String[] args) {
        System.out.println("Enter the n e.g n=3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i<n; i++) {
            for(int j =0; j<n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
