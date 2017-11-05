import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sammie on 10/31/2017.
 */
public class PairSumCount {

    static int countPair(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int key = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(countPair(arr,key)); // O(n^2);
        }
    }
}
