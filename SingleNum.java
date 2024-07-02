import java.util.*;

public class SingleNum {
    // Brutforce 1
    // public static int findSingleNum(int arr[], int n) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         if (map.containsKey(arr[i])) {
    //             map.put(arr[i], map.get(arr[i]) + 1);
    //         } else {
    //             map.put(arr[i], 1);
    //         }
    //     }
    //     for(Map.Entry<Integer,Integer> val: map.entrySet()) {
    //         if(val.getValue()==1){
    //             return val.getKey();
    //         }
    //     }
    //     return -1;
    // }

    //Brutforce 2
    public static int findSingleNum(int arr[], int n) {
        int temp [] = new int[n+1];
        for(int i=0; i<n; i++){
            temp[arr[i]]++;
        }
        for(int i=0; i<n; i++){
            if(temp[i]==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 1 };
        int n = arr.length;
        System.out.println(findSingleNum(arr, n));
    }

}