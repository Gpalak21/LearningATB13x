package ex_21_Exceptions;

public class Lab057_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a =10/0;
        }
        catch(ArithmeticException e){
            System.out.println("ARE YOU FOOL");
        } catch (Exception e) {
            System.out.println("ARE YOU FOOL TOO");
        }
        System.out.println("2");
    }
}
