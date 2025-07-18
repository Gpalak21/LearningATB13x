package Tasks.Task_11July;

import java.util.ArrayList;

public class Remove_Element_AL {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add("Amit");
        l.add("Neha");
        l.add("Suresh");
        System.out.println(l);
        l.remove(1);
        System.out.println("Updated list----");
        System.out.println(l);
    }
}
