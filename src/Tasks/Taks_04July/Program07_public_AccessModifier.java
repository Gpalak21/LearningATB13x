package Tasks.Taks_04July;

public class Program07_public_AccessModifier {
    public static void main(String[] args) {
        student s1 = new student();
        s1.showInfo();
    }
}

class student{
    public void showInfo(){
        System.out.println("Public Access: Student Info");
    }

}
