package Tasks.Task_03July;

public class FindMaximum {
    public static void main(String[] args) {
        Utility u = new Utility();
        int r1=u.max(4,5);
        int r2=u.max(1,4,6);
        System.out.println(r1);
        System.out.println(r2);

    }

}

class Utility{
    int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    int max(int a , int b, int c){
       if(a>=b && a>=c){
           return a;
       } else if (b>=c) {
           return b;
       }
       else{
           return c;
       }

    }
}
