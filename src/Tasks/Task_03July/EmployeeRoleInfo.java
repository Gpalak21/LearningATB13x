package Tasks.Task_03July;

public class EmployeeRoleInfo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.role();
        Manager m1 = new Manager();
        m1.role();
        Clerk c1 = new Clerk();
        c1.role();
        Tester t1 = new Tester();
        t1.role();
        Employee e2 = new Tester();
        e2.role();
    }

}

class Employee{
     void role()
     {
         System.out.println("General Employee");
     }
}

class Manager extends Employee{
    void role(){
        System.out.println("Deputy Manager");
    }
}

class Clerk extends Employee{
    void role(){
        System.out.println("Clerk");
    }
}

class Tester extends  Employee{
    void role(){
        System.out.println("Quality Engineer");
    }
}
