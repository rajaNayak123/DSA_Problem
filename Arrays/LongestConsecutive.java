package Arrays;
import java.util.Arrays;

public class LongestConsecutive {
    
    public static int findLongestConsecutive(int arr[], int n) {
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int x = arr[i];
            
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2, 1 };
        int n = arr.length;
        System.out.println(findLongestConsecutive(arr, n));
    }
}
