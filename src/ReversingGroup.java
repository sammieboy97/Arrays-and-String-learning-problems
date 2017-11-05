/**
 * Created by Sammie on 10/31/2017.
 */
public class ReversingGroup {

    static void swap(char c[], int i, int size) {
        int k = i + size-1;
        for (int j = i; j != k && k< c.length; j++,k--) {

         //   System.out.println("entered");
            char temp = c[j];
            c[j] = c[k];
            c[k] = temp;
        }
       // System.out.println(String.valueOf(c));
    }

    public static void main(String[] args) {
        String s = "Hello Mastera";
        int size = 3;
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i += size) {
            swap(c, i, size);
        }
        System.out.println(String.valueOf(c));
    }
}
