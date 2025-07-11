package Tasks.Task_03July;

public class AddTwoNumbers {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int result1 = c1.add(10,20);
        double result2= c1.add(21.3, 65.1);
        System.out.println(result1);
        System.out.println(result2);
    }

}

class Calculator{

    int add(int a, int b){
        return a+b;
    }

    double add(double a , double b){
        return a+b;
    }
}
