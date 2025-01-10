import java.util.Arrays;

public class Mergearray2 {
    public static void main (String[] args){
        int[] maxarray = {11, 20, 18};
        int[] minarray = {2, 6, 3, 7};
        int[] array3 = {10, 8, 5};

        int j=0;


        int[] mergeArray = new int[maxarray.length + minarray.length + array3.length];

        for (int i = 0; i < maxarray.length; i++) {
            mergeArray[j] = maxarray[i];
            j++;
        }

        for (int i = 0; i < minarray.length; i++) {
            mergeArray[j] = minarray[i];
            j++;
            //mergedArray[i]=minarray[i];
        }

        for (int i = 0; i < array3.length; i++) {
            mergeArray[j] = array3[i];
            j++;
        }


        System.out.println("Merged Array: " + Arrays.toString(mergeArray));
    }
}
