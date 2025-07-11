package Tasks.Task_03July;

public class LoginFunctionality {
    public static void main(String[] args) {
        User u1 = new AdminUser();
        u1.login();
        User u2 = new RegularUser();
        u2.login();

    }
}

class User{
    void login(){
        System.out.println("User Login");
    }
}

class AdminUser extends User{
    @Override
    void login(){
        System.out.println("I am a Admin!");
    }
}

class RegularUser extends User{
    @Override
    void login(){
        System.out.println("I am a regular user, I can't access admin");
    }
}
