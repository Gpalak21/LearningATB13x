package ex_11_Constructor;

public class Lab034_OOPs_Constructor {

    public static void main(String[] args) {
        Baby b1 = new Baby();
    }


}


class Baby {
    String name;

    //Default constructor
    Baby() {
        System.out.println("Hi, i am the default constructor");
    }

    void cry() {
        System.out.println("Cry");
    }

    void sleep() {
        System.out.println("Sleep");
    }

    void eat() {
        System.out.println("Eat");
    }

}

