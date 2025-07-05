package String_Test;

public class Question2 {
    public static void main(String[] args) {
        String String1= "Hello";
        String String2= "hello";
        String String3= "Hello";

        System.out.println("equals(): "+String1.equals(String2));
        System.out.println("equalsIgnoreCase(): "+String1.equalsIgnoreCase(String2));
        System.out.println("compareTo(): "+String1.compareTo(String2));
    }
}
