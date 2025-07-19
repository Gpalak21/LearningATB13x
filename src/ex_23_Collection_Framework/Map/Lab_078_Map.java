package ex_23_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_078_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap(10);
        m1.put("name","Palak");
        m1.put("rollNo",1);
        m1.put("phone",776789920);
        System.out.println(m1);

        //LinkedHash Map
        Map m2 = new LinkedHashMap();
        m2.put("name","Palak");
        m2.put("rollNo",1);
        m2.put("phone",776789920);
        System.out.println(m2);

        //Tree Map
        Map m3 = new TreeMap();
        m3.put("name","Palak");
        m3.put("rollNo",1);
        m3.put("phone",776789920);
        System.out.println(m3);



    }
}
