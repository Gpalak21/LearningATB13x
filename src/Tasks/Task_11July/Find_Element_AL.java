package Tasks.Task_11July;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_Element_AL {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Mumbai");
        arrayList.add("Delhi");
        arrayList.add("Pune");
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a city:");
         String city = scr.next();
        if(arrayList.contains(city)){
            System.out.println(city+" is in the list");
        }
        else {
            System.out.println(city+" is not in the list");
        }


    }
}
