import java.util.ArrayList;
import java.util.Arrays;

public class findmissingnumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,6};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(i);
            }
        }
        System.out.println("Missing numbers: " + missingNumbers);
    }
}
