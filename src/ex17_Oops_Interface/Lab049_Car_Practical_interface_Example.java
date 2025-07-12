package ex17_Oops_Interface;

public class Lab049_Car_Practical_interface_Example {
    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drive();

    }


}

class Car1 implements Engine,Brakes{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();

    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}













interface Brakes{
    void applyBreak();
}

interface Engine{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("Default Complete Function");
    }
}