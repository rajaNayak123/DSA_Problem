public class MajorityElement {
    // Optimal
    public static int findMajorityEle(int arr[], int n) {
        int count = 0;
        int ele = arr[0];

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = arr[i];
                count = 1;
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                cnt++;
            }
            if (cnt > n / 2) {
                return ele;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int n = arr.length;
        System.out.println(findMajorityEle(arr, n));
    }
}
