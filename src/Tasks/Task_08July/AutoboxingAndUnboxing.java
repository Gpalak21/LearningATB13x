package Tasks.Task_08July;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        int a =50;
        Integer b =a;
        System.out.println("Primitive: "+a);
        System.out.println("Wrapper: "+b);
        int c = b;
        System.out.println("Unboxed again:  "+c);
    }
}
