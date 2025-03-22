import java.util.ArrayList;
import java.util.List;

public class LeaderArr {
    
    // Optimal implementation
    public static List<Integer> findLeaderEle(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int mxi = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(arr[i]>mxi){
                list.add(arr[i]);
                mxi = arr[i];
            }
        }
        return list;
    }

    
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        int n = arr.length;
        System.out.println(findLeaderEle(arr, n));
    }
}
