/**
 * Created by Sammie on 10/31/2017.
 */
public class LeastSurpasser {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 12, 5, 40, 21, 70, 1, 49, 37};
        for (int i = 0; i < arr.length-1; i++) {
            int max = Integer.MAX_VALUE;
            int temp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i] && arr[j] < max) {
               //     System.out.println("Entered at max = " + max);
                    max = arr[j];
             //       System.out.println("Entered at max = " + max);
                    temp = j;
                }
            }
            if(max!=Integer.MAX_VALUE){

                arr[i] = arr[temp];
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
