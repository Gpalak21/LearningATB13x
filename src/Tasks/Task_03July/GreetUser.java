package Tasks.Task_03July;

import java.sql.SQLOutput;

public class GreetUser {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        g1.greet();
        g1.greet("Palak");
    }

}

class Greeter{
     void greet(){
         System.out.println("Hello!");
     }

     void greet(String name){
         System.out.println("Hello,"+name);
     }
}
