package Tasks.Task_03July;

public class AnimalSounds {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
        Cow c1 = new Cow();
        c1.sound();
    }

}

class Animal{
     void sound(){
         System.out.println("Hi I am a Parent Class");

     }
}

class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Bark!");
    }

}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Meow!");

    }
}

class Cow extends Animal{

    @Override
    void sound(){
        System.out.println("Moo!");

    }
}
