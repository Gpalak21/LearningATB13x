package ex_23_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab_074_AL_Students {
    public static void main(String[] args) {
        Student s1 = new Student("Amit","1");
        Student s2 = new Student("Ritvik","2");
        Student s3 = new Student("Shubham","3");

        ArrayList<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.printDetails();
        s2.printDetails();


    }
}

class Student{
    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printDetails(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student rollNo: "+this.rollNo);
    }

//    @Override
//    public String toString() {
//        return "Student{"+
//                "name='"+name+'\''+
//                ", rollNo='"+rollNo+'\''+
//                '}';
//    }
}
