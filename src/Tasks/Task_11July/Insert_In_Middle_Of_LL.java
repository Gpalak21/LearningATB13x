package Tasks.Task_11July;

import java.util.LinkedList;
import java.util.List;

public class Insert_In_Middle_Of_LL {
    public static void main(String[] args) {
        List ll= new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Mango");
        System.out.println(ll);
        System.out.println("After insertion------");
        ll.add(1,"Orange");
        System.out.println(ll);
    }
}
