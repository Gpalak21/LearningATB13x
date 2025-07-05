package ex_09_Array;

import java.util.Scanner;

public class Lab30_DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of array:");
        int[][] arr = new int[n][n];

        /* Inserting elements in array*/
        for (int i = 0; i < n; i++) {
            for(int j =0; j<n ; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        /* Printing elements of array*/
        for (int i = 0; i < n; i++) {
            for(int j =0; j<n ; j++){
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println();
        }
        int sum =0;
        for(int i =0;i<n;i++){
            for(int j =i ; j<n ; j++){
                 sum = sum + arr[i][j];
                 break;
            }
        }
        System.out.println("Diagonal sum is:"+sum);
    }
}
