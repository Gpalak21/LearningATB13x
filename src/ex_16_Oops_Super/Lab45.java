package ex_16_Oops_Super;

public class Lab45 {
    public static void main(String[] args) {
        Car c1 = new Car(123);
        c1.display();

    }


}

class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default C");
    }

    Vehicle(int a){
        System.out.println("Param C");
    }

    void message(int a){
        System.out.println("Type 2");

    }

    void message(){
        System.out.println("Type 1");
    }

    int message(String a){
        System.out.println("Type 4");
        return 0;
    }

    void display(){
        System.out.println("Vehicle parent");
    }


}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
        super();
    }

    Car(int a){


    }

    @Override
    void display() {
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        System.out.println("Hi Override!");
    }
}
