package ex_13_OOPS_Polymorphism_MethodOverloading.Overriding;

public class Lab042_overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("default sound!");
    }
}

class Dog extends  Animal{

    @Override
    void sound(){
        System.out.println("Bark!");
    }
}
