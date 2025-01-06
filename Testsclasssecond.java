import java.io.IOException;
import java.util.ArrayList;

public class Testsclasssecond {

    public static void main(String[] args)  {

        ArrayList<String> array =new ArrayList<String>();
        array.add("nive");
        array.add("kani");
        array.add("moni");
        array.add("kala");

        ArrayList<String> findingarray = new ArrayList<String>();
        findingarray.add("kani");
        findingarray.add("moni");
        findingarray.add("kala");
        Boolean VV=false;

        for (int i = 0; i < findingarray.stream().count(); i++) {
            for(int j=0; j < array.stream().count(); j++) {
                if (findingarray.get(i).equals(array.get(j))) {
                    VV = true;
                    break;
                }
            }
             if(VV == true){
                 System.out.println( "This number is present" + findingarray.get(i));
             }  else
                 System.out.println( "This number is present" + findingarray.get(i));
              VV=false;

            }

        }

    }




