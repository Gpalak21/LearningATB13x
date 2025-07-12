package Tasks.Taks_04July;

public class Program03_Variable_Super {
    public static void main(String[] args) {
        Son s = new Son();
        s.displayData();
    }
}

class Father{
    int gold = 10;
    int bhk = 3;

}

class Son extends Father{
    int gold = 5;
    int bhk = 2;

    void displayData(){
        System.out.println("Son gold is "+gold);
        System.out.println("Son bhk is "+bhk);
        System.out.println("Father gold is "+ super.gold);
        System.out.println("Father bhk is "+super.bhk);
    }

}
