package Tasks.Task_07July;

public class BankInterestCalculation {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        s1.getInterestRate();
        HDFC h1 = new HDFC();
        h1.getInterestRate();
    }

}

abstract class Bank{
    abstract void getInterestRate();
}

class SBI extends Bank{

    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank{

    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}
