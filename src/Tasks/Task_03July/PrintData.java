package Tasks.Task_03July;

public class PrintData {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.printData("Palak");
        p1.printData(10);
        p1.printData(23.22f);

    }
}

class Printer{
    void printData(String data){
        System.out.println("Hi i print a string like "+data);
    }

    void printData(int data){
        System.out.println("Hi I print integer data like "+data);

    }

    void printData(float data){
        System.out.println("Hi I print float data like "+data);
    }

}
