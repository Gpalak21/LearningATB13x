package Tasks.Taks_04July;

public class Program02_Method_Super {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.getSound();
    }

}

class Animal{



    Animal(){
        System.out.println(" Hi, I am a default animal constructor. ");
    }

    void Sound( ){
        System.out.println(" Different Animals make different sounds. ");
    }
}

class Dog extends Animal{
    void Sound(){
        System.out.println("Dog Bark");
    }

    void getSound(){
        Sound();
        super.Sound();
    }
}

