package Tasks.Taks_04July;

public class Program06_Protected_AccessModifier {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.doEat();
    }
}

class animal{
    protected void eat(){
        System.out.println(" Animal is eating. ");

    }
}

class dog extends animal{
    void doEat(){
        eat();
    }
}
