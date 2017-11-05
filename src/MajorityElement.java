/**
 * Created by Sammie on 10/31/2017.
 */
public class MajorityElement {
    public static void main(String[] args) {
        String s = "Hello World!";
        int arr[] = new int[127];
        char c[] = s.toCharArray();
        int max = Integer.MIN_VALUE;
        char maxChar = ' ';
        for (int i = 0; i < c.length; i++) {
            arr[c[i]]++;
            if (arr[c[i]] > max) {
                max = arr[c[i]];
                maxChar = c[i];
            }
        }
        System.out.println("Most repeated alphabet is : " + maxChar);
    }
}
