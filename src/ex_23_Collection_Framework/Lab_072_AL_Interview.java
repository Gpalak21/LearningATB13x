package ex_23_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_072_AL_Interview {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
