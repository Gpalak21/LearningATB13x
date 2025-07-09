package Tasks.Taks_02_July;

public class Animal_Sound_Simulatore {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();
        c1.meow();

    }
}

class Animal{
    void makeSound(){
        System.out.println("I make meow sound!");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meow!");
    }
}
