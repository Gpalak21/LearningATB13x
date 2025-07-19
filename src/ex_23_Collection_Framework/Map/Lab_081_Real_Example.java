package ex_23_Collection_Framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab_081_Real_Example {
    public static void main(String[] args) {
        Map<String,Object> student1= new HashMap<>();
        student1.put("name","Abhinav");
        student1.put("phone",7896785642l);
        student1.put("address1","Gorakhpur");
        student1.put("address2",560021);

        Map<String,Object> student2= new HashMap<>();
        student2.put("name","Palak");
        student2.put("phone",7896785642l);
        student2.put("address1","Agra");
        student2.put("address2",560021);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
