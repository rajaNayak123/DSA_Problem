package Arrays;
public class BuyAndSellStock {
    public static int bestTimeBuyStockAndSell(int arr[], int n) {
        int mini = arr[0];
        int profit = 0;
        for(int i=1; i<n; i++){
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }  
        return profit; 
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int n = arr.length;
        System.out.println(bestTimeBuyStockAndSell(arr, n));
    }
}