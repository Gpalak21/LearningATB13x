package ex_11_Constructor;

public class Lab036_PC {
    public static void main(String[] args) {
        Person p1 = new Person("Palak",79839451,"XYZ");

        System.out.println(p1.address);
    }

}

class Person{
    String name;
    long phone;
    String address;

    Person(String name_user, long phone_user, String address_user){
        this.name = name_user;
        this.phone = phone_user;
        this.address = address_user;
    }
}