package ex_07_Functions;

import java.util.Scanner;

public class Lab019_Function_Ques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a=0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }else{
            System.out.println("Enter integer only");
            System.exit(0);
        }


        System.out.println("Enter the num 2");
        int b =0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }else{
            System.out.println("Enter integer only");
            System.exit(0);
        }



        int result_sum=sum(a,b);
        System.out.println(result_sum);

       int result_mul= mul(a,b);
        System.out.println(result_mul);

        int result_sub = sub(a,b);
        System.out.println(result_sub);

        int result_div = div(a,b);
        System.out.println(result_div);
    }

    /** Add two integers
    @param a the first integer
    @param b the second integer
    @return the sum of a and b
     */

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a , int b){
        return a-b;
    }


    static int mul(int a , int b){
        return a*b;
    }

    static int div(int a , int b){
        if(b==0){
            System.out.println("B can't be zero.");
//            throw new ArithmeticException("B can't be zero.");
            return 0;

        }
        else {
            return a / b;
        }
    }
}
