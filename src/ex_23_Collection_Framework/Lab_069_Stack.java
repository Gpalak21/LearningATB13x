package ex_23_Collection_Framework;

import java.util.Stack;

public class Lab_069_Stack {
    public static void main(String[] args) {
            Stack s1 = new Stack();
            s1.add("Python");
            s1.add("C#");
            s1.add("Java");
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);
        s1.push("DSA");
        System.out.println(s1);
    }
}
