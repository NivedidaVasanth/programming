import java.util.HashMap;
import java.util.Map;

public class TestProgramproblems6to10 {

    public static void main(String[] args) {
       // problem6consecutivenumbersum(new int[] {2, 5, 6, 10,23}, 16);

       // problem7_twosum(new int[]{1,2,3,4,5,6}, 3);
        problem8_subarrays(new int[]{5, 4, 3,1,8,6}, 9);
        //problem9printingstar(10);
       // problem10printingplus(10);

    }

    //program 6
    public static void problem6consecutivenumbersum( int[]arr,int target) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }




    //program7
    public static void problem7_twosum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if ((map.containsKey(complement) && map.get(complement) != i)) {
                System.out.println(arr[i] + "  " + complement);
            }
        }
    }


    //problem 8

    public static void problem8_subarrays(int[]arr, int target){
        Map<Integer, Integer>map=new HashMap<>();
        int sum=0;
        int count=0;
        for (int i=0; i < arr.length; i++){

            sum +=arr[i];
            if (sum==target)
                count++;
            if (map.containsKey(sum-target)){
                        count += map.get(sum - target);
                        map.put(sum,map.getOrDefault(sum, 0) +1);
                        }

        }
        System.out.println(count);


    }

    //problem 9
    public static void problem9printingstar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //problem 10
    public static void problem10printingplus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
