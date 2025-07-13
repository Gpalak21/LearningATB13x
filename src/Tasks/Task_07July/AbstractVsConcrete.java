package Tasks.Task_07July;

public class AbstractVsConcrete {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
        c1.display();
    }
}

abstract class Parent{
    abstract void show();
    void display(){
        System.out.println("Concrete method in abstract class");
    }

}

class Child extends Parent{

    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}
