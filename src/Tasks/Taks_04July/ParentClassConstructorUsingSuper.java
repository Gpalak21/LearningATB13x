package Tasks.Taks_04July;

import java.sql.SQLOutput;

public class ParentClassConstructorUsingSuper {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
    }



}

class Car{

    Car(){
        System.out.println("Parent Class Constructor");
    }
    void showDetail(){
        System.out.println(" Hi, I contain the details. ");
    }
}

class Vehicle extends Car{

    Vehicle(){
        super();
    }

}
