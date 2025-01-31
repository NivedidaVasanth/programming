import java.util.HashMap;
import java.util.Map;

public class Testprogramproblems1to5 {
    public static void main(String[] args) {
      //  program1_findingcharacterscount("nivaashnidhi");
       // System.out.println();
       // program2fibonacci(10);
       // System.out.println();
       // program3factorial(6);
      //  System.out.println();
      //  program4reversethestring("nivedida");
       // System.out.println();
        program5primenumber(15);
        System.out.println();



    }

    //problem 1
    public static void program1findingcharacterscount(String name) {
        //Initialize a Map
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            //Get the Char at the position
            char ch = name.charAt(i);
            // Check if that char is present in the Map
            if (map.containsKey(ch)) {
                //if present update the char and increment teh count (integer)
                map.put(ch, map.get(ch) + 1);
            } else {
                //Else add that char with a cont as 1
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }

    //problem 2
    public static void program2fibonacci(int n) {
        int  firstnumberA = 0, secondnumberB= 1,  nextnumberC= 0;
        for (int i = 0; i < n; i++) {
            nextnumberC = firstnumberA + secondnumberB;
            firstnumberA=secondnumberB;
            secondnumberB = nextnumberC;

            System.out.print(nextnumberC+", ");
        }
    }


    //problem 3
    public static void program3factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println(fact);
        }
    }


    //problem 4

    public static void program4reversethestring(String str) {
        String rev = "";
        System.out.println(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println((rev));
    }

// problem 5

    public static void program5primenumber(int n) {
        for (int i = 2; i <= n; i++) {
            boolean z = true;
           // System.out.println("the value i here " + i);

           // System.out.println("the value of second loop "
           //         + i / 2);
            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                  //  System.out.println("the value of i  " + i);
                  //  System.out.println("the value of j " + j);
                    z = false;
                    break;

                }
                if (z) {
                    System.out.println(i + "");
                }
            }
        }


    }
}