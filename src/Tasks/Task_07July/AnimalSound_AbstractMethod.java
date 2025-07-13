package Tasks.Task_07July;

public class AnimalSound_AbstractMethod {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }

}

abstract class Animal{
    abstract void makeSound();
}

class dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Cat Meows");
    }
}
