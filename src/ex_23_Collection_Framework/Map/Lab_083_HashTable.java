package ex_23_Collection_Framework.Map;

import java.util.Hashtable;

public class Lab_083_HashTable {
    public static void main(String[] args) {
        Hashtable <Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        System.out.println(ht1);

        //ht1.put(null,null);
    }
}
