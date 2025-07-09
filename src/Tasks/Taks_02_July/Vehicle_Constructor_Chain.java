package Tasks.Taks_02_July;

public class Vehicle_Constructor_Chain {

    public static void main(String[] args) {
        Bike b1 = new Bike();
    }


}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is Ready");
    }
}

class Vehicle{
     Vehicle(){
         System.out.println("Vehicle is ready");
     }
}

