package ex_09_Array;

public class Lab025_Second_Largest_Array {
    public static void main(String[] args) {
        int [] array = {5,74,4,34,66,89,23,56,90,1,33};

        int second_largest_find = second_largest(array);
        System.out.println(second_largest_find);


    }

    static int second_largest(int[] array){
        int max1 = array[0];
        int max2=array[0];
        for (int i = 0; i < array.length ; i++) {
            if(max1<array[i]){
                max2=max1;
                max1=array[i];
            }

        }
        return max2;
    }
}
