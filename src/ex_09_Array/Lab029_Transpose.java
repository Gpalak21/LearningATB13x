package ex_09_Array;

import java.util.Scanner;

public class Lab029_Transpose {
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

        for (int i = 0; i < n; i++) {
            for(int j =i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("Printing the transpose matrix:");
        for (int i = 0; i < n; i++) {
            for(int j =0; j<n ; j++){
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
