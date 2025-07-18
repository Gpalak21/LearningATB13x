package Tasks.Task_11July;

import java.util.ArrayList;

public class Add_Display_AL {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Dipak");
        list.add("Ravi");
        list.add("Sneha");
        list.add("Priya");
        list.add("Anjali");

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
