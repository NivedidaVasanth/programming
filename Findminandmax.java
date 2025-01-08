import java.util.ArrayList;
import java.util.Arrays;

public class Findminandmax {

    public static void main(String[] args) {
        int[] numbers = {2,6,11,20,3,7,18};
        int min = getMin(numbers);
        int max =getMax(numbers);
        ArrayList<Integer> maxarray = getMaxarray(numbers, 10);
        ArrayList<Integer> minarray = getMinarray(numbers, 10);
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The Maximum value in the array is: " + max);
        System.out.println("The Maximum array is: " + Arrays.toString(maxarray.toArray()));
        System.out.println("The Min array is: " + Arrays.toString(minarray.toArray()));
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static ArrayList<Integer> getMaxarray(int[] array, int pivot) {
        ArrayList<Integer> maxarray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > pivot) {
                maxarray.add(array[i]);
            }
        }
        return maxarray;
    }

    public static ArrayList<Integer>  getMinarray(int[] array, int pivot) {
        ArrayList<Integer> minarray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                minarray.add(array[i]);
            }
        }
        return minarray;
    }
}
