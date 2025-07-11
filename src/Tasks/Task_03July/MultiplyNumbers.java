package Tasks.Task_03July;

public class MultiplyNumbers {
    public static void main(String[] args) {
        MathOperations mo1 = new MathOperations();
        int r1=mo1.multiply(2,3);
       int r2=  mo1.multiply(4,5,6);
        System.out.println(r1);
        System.out.println(r2);
    }

}

class MathOperations{
    int multiply(int a , int b){
        return a*b;

    }

    int multiply(int a, int b, int c){
        return a*b*c;
    }
}
