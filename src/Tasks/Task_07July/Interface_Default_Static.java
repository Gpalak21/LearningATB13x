package Tasks.Task_07July;

public class Interface_Default_Static {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Vehicle.fuelType();
    }
}

interface Vehicle{
    default void start(){
        System.out.println("Vehicle started");
    }
    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle{

}
