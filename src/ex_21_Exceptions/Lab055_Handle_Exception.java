package ex_21_Exceptions;

public class Lab055_Handle_Exception {
    public static void main(String[] args) {
        int a =0;
        try {
            a=10/0;
        } catch (Exception e) {
            System.out.println("Divide by zero is not allowed");
        }
        System.out.println(a);
    }
}
