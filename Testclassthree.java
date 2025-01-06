import java.io.IOException;
import java.util.ArrayList;

public class Testclassthree {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("1");
        array.add("a");
        array.add("3");
        boolean vv = false;
        //Finiding one Element
        String str = "a";
        for (int i = 0; i < array.stream().count(); i++) {
            if (array.get(i).equals(str)) {
                vv = true;
                break;
            }
        }
        if (vv == true) {
            System.out.println("This Number is present " + str);
        } else
            System.out.println("This Number is not present " + str);
    }
}
