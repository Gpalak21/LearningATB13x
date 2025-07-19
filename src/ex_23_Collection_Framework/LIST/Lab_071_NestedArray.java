package ex_23_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_071_NestedArray {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Orange");
        fruits1.add("Apple");
        fruits1.add("Cherry");

        System.out.println(fruits1);

        List fruits2 = new ArrayList<>();
        fruits2.add("Mango");
        fruits2.add("Grapes");
        fruits2.add("Papaya");
        System.out.println(fruits2);

        List vegetables = new ArrayList();
        vegetables.add("Tomato");
        vegetables.add("Potato");
        vegetables.add("Onion");
        System.out.println(vegetables);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetables);
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(2));

    }
}
