package Tasks.Taks_02_July;

public class Multilevel_Login_System {
    public static void main(String[] args) {
        superAdmin s1 = new superAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutDownSystem();
    }
}

class User{
    void login()
    {
        System.out.println("Hi enter your details for login.");
    }
}

class adminUser extends User{
    void accessAdminPanel(){
        System.out.println("Enter Admin details here:");
    }
}

class superAdmin extends adminUser
{
    void shutDownSystem(){
        System.out.println("click here to shut down the system");
    }
}