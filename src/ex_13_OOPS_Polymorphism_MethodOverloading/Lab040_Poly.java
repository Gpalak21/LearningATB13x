package ex_13_OOPS_Polymorphism_MethodOverloading;

public class Lab040_Poly {
    public static void main(String[] args) {
        mathOperations m1 = new mathOperations();
        int r1= m1.add(2,3);
        int r2= m1.add(3,4,5);
        double r3= m1.add(3.14, 4.56);
        String r4= m1.add("palak","gupta");
    }

}

class mathOperations{
    int add(int a , int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }
}
