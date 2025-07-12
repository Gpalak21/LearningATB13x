package ex17_Oops_Interface;

public class Lab048_Abstraction_interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,10);

        Square s1 = new Square();
        s1.getArea(20,5);

       // Polygon p1 = new Polygon()


    }
}

class Rectangle implements Polygon{
    @Override
   public void getArea(int length, int breadth){
        System.out.println("Area of Rectangle->"+(length*breadth));
    }
}

class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of a square ->"+3.14*length*breadth);
    }
}

interface Polygon{
   // In the interface, by default, all methods are incomplete.
    void getArea(int length, int breadth);

   default void complete(){
        System.out.println(" A complete method is allowed in an interface with the default keyword. ");
    }

    default void complete2(){
        System.out.println(" You can have an unlimited number of default functions. ");
    }

    static void staticComplete(){
        System.out.println(" Static functions in interfaces are allowed. ");
    }
}
