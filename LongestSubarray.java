/**
 * Longest subarray with sum k
 */
public class LongestSubarray {
    public static int subarraySum(int[] arr, int k) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int l = i; l < j; k++) {
                    sum += arr[l];
                }
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;
        System.out.println(subarraySum(arr, k));
    }
}