public class LongestSubarray {
    public static int findLongestSubarray(int arr[], int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = arr[0];

        while (right < arr.length) {
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 2,3,5,1,9 };
        int k = 10;
        int len = findLongestSubarray(arr, k);
        System.out.println(len);
    }
}
