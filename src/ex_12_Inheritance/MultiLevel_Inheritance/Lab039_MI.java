package ex_12_Inheritance.MultiLevel_Inheritance;

public class Lab039_MI {
    public static void main(String[] args) {
        Son amit = new Son();
        //Son s1 = new Father();
        Grandfather g1 = new Son();
        g1.gf();
        g1.home();

        Grandfather g2 = new Father();
        g2.home();

        Father f2 = new Son();
        f2.home();
    }
}
