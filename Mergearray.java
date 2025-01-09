import java.util.Arrays;
import java.util.Arrays;

public class Mergearray {
    public static void main(String[] args) {
        int[] maxarray = {11, 20, 18};
        int[] minarray = {2, 6, 3, 7};
        int[] array3 = {10, 8, 5};


        int[] mergedArray = new int[maxarray.length + minarray.length + array3.length];

        for (int i = 0; i < maxarray.length; i++) {
            mergedArray[i] = maxarray[i];
        }
        for (int i = 0; i < minarray.length; i++) {
            mergedArray[maxarray.length + i] = minarray[i];
            //mergedArray[i]=minarray[i];
        }

        for (int i = 0; i < array3.length; i++) {
            mergedArray[maxarray.length + minarray.length + i] = array3[i];
        }


        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}




