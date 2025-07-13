package Tasks.Task_07July;

public class AbstractClassWithConstructor {
    public static void main(String[] args) {
        normal N = new normal();
        N.method();
    }

}

abstract class abstractConstructor{
    abstractConstructor(){
        System.out.println("Abstract class constructor called");
    }
    abstract void method();
}

class normal extends abstractConstructor{

    @Override
    void method() {
        System.out.println("Method from abstract class");
    }
}
