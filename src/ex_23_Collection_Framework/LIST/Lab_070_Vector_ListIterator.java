package ex_23_Collection_Framework.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab_070_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator Li = vector.listIterator();
        while(Li.hasNext()){
            System.out.println(Li.next());
        }

        System.out.println("Reverse List-----");

        while(Li.hasPrevious()){
            System.out.println(Li.previous());
        }

        System.out.println("-----------");

        Iterator i = vector.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
