package ex_23_Collection_Framework.Map;

import java.util.*;

public class Lab_079_HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> vehicles = new HashMap();
        vehicles.put("MG Astor",1);
        vehicles.put("i10",1);
        vehicles.put("Honda Activa",1);
        vehicles.put("BMW",2);
        vehicles.put("Tesla",5);
        vehicles.put("Tesla",10);
      //  vehicles.put(23,5);
        System.out.println("Total Vehicles "+vehicles.size());

        //Iterate over map
        for(String key: vehicles.keySet()){
           // System.out.println("Keys: "+key);
            System.out.println(key+" -> "+vehicles.get(key));
        }

        //Checking if key exist

        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        vehicles.clear();
        System.out.println(vehicles.size());


    }
}
