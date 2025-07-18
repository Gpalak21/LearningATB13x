package Tasks.Task_11July;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AL_vs_LL {
    public static void main(String[] args) {
        List<Long> al = new ArrayList<>();
        List<Long> l = new LinkedList<>();
        long startAlTime=System.currentTimeMillis();
        for(long i =0;i<=99999;i++){
            al.add(i);
        }
        long endAlTime = System.currentTimeMillis();
        System.out.println("Array List Time Taken: "+(endAlTime-startAlTime)+"ms");

        long startLLTime=System.currentTimeMillis();
        for(long i =0;i<=99999;i++){
            l.add(i);
        }
        long endLLTime = System.currentTimeMillis();
        System.out.println("Linked List Time Taken: "+(endLLTime-startLLTime)+"ms");
    }
}
