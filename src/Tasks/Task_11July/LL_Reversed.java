package Tasks.Task_11July;

import java.util.LinkedList;
import java.util.List;

public class LL_Reversed {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        List l1 = new LinkedList();
         l1=list.reversed();
        System.out.println("Reversed Linked List-----");
        System.out.println(l1);
    }
}
