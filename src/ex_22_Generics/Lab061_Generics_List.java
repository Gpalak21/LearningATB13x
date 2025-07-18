package ex_22_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab061_Generics_List {
    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Palak");
        normalList.add(true);

        List<Integer> integerList = new ArrayList();
        integerList.add(10);
    }
}
