/**
 * Created by Sammie on 11/1/2017.
 */
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {2, 10, 11, 20, -5, 40, 60, 90, 1, 100,100};
        int max = Integer.MIN_VALUE;
        int max2 =  Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
