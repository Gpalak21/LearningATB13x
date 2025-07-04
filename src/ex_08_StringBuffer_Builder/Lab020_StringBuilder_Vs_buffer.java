package ex_08_StringBuffer_Builder;

public class Lab020_StringBuilder_Vs_buffer {
    public static void main(String[] args) {
        String s0 ="Palak";
        String s1= new String("Palak");

        StringBuffer stringBuffer= new StringBuffer("Palak");
        StringBuilder stringBuilder = new StringBuilder("Palak");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }

}
