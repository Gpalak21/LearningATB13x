package Array;

public class Lab024_Array {
    public static void main(String[] args) {
        int[] array = {25,14,56,15,36,56,77,18,29,49};

        int max_output = max(array);
        System.out.println(max_output);


    }

    static int max(int[] array){
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
            }

        }
        return max;
    }
}
