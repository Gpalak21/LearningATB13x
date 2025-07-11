package Tasks.Task_03July;

public class VehicleStart {
    public static void main(String[] args) {
        Bike b1= new Bike();
        b1.start();
        Car c1 = new Car();
        c1.start();
        Vehicle v1 = new Vehicle();
        v1.start();
    }

}

class Vehicle{
    void start(){
        System.out.println("I am a parent class method");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Turn the key to start the car");

    }
}
