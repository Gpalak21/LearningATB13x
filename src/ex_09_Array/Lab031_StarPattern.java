package ex_09_Array;

import java.util.Scanner;

public class Lab031_StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n = scanner.nextInt();

        for(int i =1 ; i<=n ; i++){
            for(int k =i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                System.out.print("*");
            }
            for(int t =i; t>1;t--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
