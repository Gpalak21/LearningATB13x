package ex_23_Collection_Framework;

import java.util.ArrayList;

public class Lab_065_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("palak");
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.add("gupta");
        System.out.println(arrayList);
        arrayList.add("gupta");
        arrayList.add(123);
        System.out.println(arrayList);

    }
}
