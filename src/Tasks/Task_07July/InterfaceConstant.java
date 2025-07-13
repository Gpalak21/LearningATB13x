package Tasks.Task_07July;

public class InterfaceConstant {
    public static void main(String[] args) {
        car c1 = new car();
        c1.getMax_Speed();
    }
}

interface SpeedLimit{
    int Max_Speed = 120;
}

class car implements SpeedLimit{
    void getMax_Speed(){
        System.out.println("Max Speed is "+Max_Speed);
    }
}
