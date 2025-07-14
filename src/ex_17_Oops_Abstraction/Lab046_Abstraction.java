package ex_17_Oops_Abstraction;

public class Lab046_Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car();
        Father f1 = new child(); //Dynamic Dispatch
        f1.loan50k();
    }
}

class Car{
    //This is concrete glass.
   // This does not have an abstract method.
    void done(){

    }
}

abstract class Father{
    //This is an abstract function.
    abstract void loan50k();

   // This is a complete function.
    void loan25k(){
        System.out.println("Given the 25k");
    }

}

class child extends Father{
    @Override
    void loan50k(){
        System.out.println("Son has to give 50k loan");
    }

}
