import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Testc {

    public static void main(String[] args) throws IOException {

        ArrayList<String> array = new ArrayList<String>();
        array.add("1");
        array.add("a");
        array.add("3");

        ArrayList<String> findingarray = new ArrayList<String>();
        findingarray.add("1");
        findingarray.add("a");
        findingarray.add("4");


        boolean vv = false;
        int val= -1;
// Finding elements in another Array
        for (int x = 0; x < findingarray.stream().count(); x++) {
            for (int y = 0; y < array.stream().count(); y++) {
                if (findingarray.get(x).equals(array.get(y))) {
                    vv = true;
                    break;
                }
            }
            if (vv == true) {
                System.out.println("This Number is present " + findingarray.get(x));
            } else
                System.out.println("This Number is not present " + findingarray.get(x));
            vv = false;
        }
    }



}
