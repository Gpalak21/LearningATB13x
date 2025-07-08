package ex_12_Inheritance;

public class Lab037_inheritance {

    public static void main(String[] args) {
        Father f1= new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        son s1 = new son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();
    }

}

class Father{
    int gold_f = 1000;

    void bhk2(){
        System.out.println("Father - 2 BHK");
    }
}

class son extends Father{

    void bhk3(){
        System.out.println("3BHK Son");
    }

}
