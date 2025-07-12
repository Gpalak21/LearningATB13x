package Tasks.Taks_04July;

public class Program04_privateAccessModifier {
    public static void main(String[] args) {
        Gender g = new Gender();
        g.setGender("Female");
       String r= g.getGender();
        System.out.println(r);
    }

}

class Gender{
   private String gender = "Male";


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
