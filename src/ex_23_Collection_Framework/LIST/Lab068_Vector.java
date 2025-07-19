package ex_23_Collection_Framework.LIST;

import java.util.Iterator;
import java.util.Vector;

public class Lab068_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("palak");
        v.add("prakhar");
        v.add(123);
        v.add("palak");
        v.add("syst");
        v.remove("palak");
        System.out.println(v);
        System.out.println(" ------ Iterator");
        Iterator iterator = v. iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
