package ex_11_Constructor;

public class Lab035_Default_Constructor  {
    public static void main(String[] args) {
        car c1 = new car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        Baby1 b1 = new Baby1();
        b1.name="Aditya";
        System.out.println(b1.name);
    }

}

class car{
    String name;
    int year;
    String model;

    car(){
        name="Unknown car";
        year=1991;
        model="XXX";
    }
}

class Baby1{
    String name;

    Baby1(){
        name = "Gugu";
    }
}
