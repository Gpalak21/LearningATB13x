package ex_23_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_075_SET_P1 {
    public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();

        hs.add("Palak");
        hs.add("Palak");
        hs.add("Gupta");
        System.out.println(hs);
    }
}
