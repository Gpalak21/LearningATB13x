package ex_21_Exceptions;

public class Lab052_ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Starting Program!");
        String input_user = args[0];
        Integer a = Integer.parseInt(input_user);
        Integer output = 100/a;
        System.out.println(output);
        System.out.println("End the program!");
    }
}
