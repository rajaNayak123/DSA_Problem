package Arrays;
import java.util.HashMap;

public class TwoSum {
    public static String findSumWithTarget(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            int rem = sum - target;
            if (map.containsKey(rem)) {
                return "yes";
            } else {
                map.put(rem, i);
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 4, 3 };
        int target = 7;
        String ans = findSumWithTarget(arr, target);
        System.out.println(ans);
    }
}