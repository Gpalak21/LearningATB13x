package ex_12_Inheritance.MultiLevel_Inheritance;

public class Lab038_Runner_class {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        gf.gf();

        System.out.println("----");

        Father f1 = new Father();
        f1.f();
        f1.gf();
    }
}
