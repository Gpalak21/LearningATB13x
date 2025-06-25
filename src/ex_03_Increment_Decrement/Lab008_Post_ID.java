package ex_03_Increment_Decrement;

public class Lab008_Post_ID {
    public static void main(String[] args) {
//        int a =10;
//        System.out.println(++a);
//        System.out.println(a);

//        int a_post = 10;
//        System.out.println(a_post++);
//        System.out.println(a_post);

        int a = 5;

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);

        int i = 1;

        i = i++ + ++i;

        System.out.println(i);

        int x = 5;

        System.out.println(x++ + ++x);

        int x1 = 5;

        System.out.println(++x1); // Output: ?

        System.out.println(x1++); // Output: ?

        System.out.println(x1);
    }
}
