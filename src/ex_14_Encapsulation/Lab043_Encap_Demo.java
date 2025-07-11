package ex_14_Encapsulation;

public class Lab043_Encap_Demo {
    public static void main(String[] args) {
        Vwlogin vw1 = new Vwlogin("admin","pass123");
        System.out.println(vw1.password);
        vw1.password = "pass234";
        System.out.println(vw1.password);

        GoodVWOLogin vwo2 = new GoodVWOLogin("admin","pwd123");
        //System.out.println(vwo2.password);
        vwo2.setPassword("palak",false);

        System.out.println(vwo2.getPassword());
    }


}

class Vwlogin{
    public String username;
    public String password;

    public Vwlogin(String username, String password){
        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }
        else{
            System.out.println("Can't change the password");
        }

    }

    public GoodVWOLogin(String usr, String pass){
        this.username = usr;
        this.password = pass;

    }
}
