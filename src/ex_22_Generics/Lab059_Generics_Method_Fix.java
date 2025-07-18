package ex_22_Generics;

public class Lab059_Generics_Method_Fix {
    public static void main(String[] args) {
        display(3,4);
        display(3,4.45);
        display("Palatal","Sky");
    }


    static <T> void display(T a, T b){
        System.out.println(a);
        System.out.println(b);
//        return null;
    }
}
