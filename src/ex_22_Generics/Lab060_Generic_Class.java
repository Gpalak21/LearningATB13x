package ex_22_Generics;

public class Lab060_Generic_Class {
    public static void main(String[] args) {
        GenericClass g = new GenericClass(10);
        GenericClass g2 = new GenericClass("Sky");
    }
}

class GenericClass <T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
