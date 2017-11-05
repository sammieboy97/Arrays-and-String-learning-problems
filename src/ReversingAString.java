/**
 * Created by Sammie on 10/31/2017.
 */
public class ReversingAString {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        System.out.println(sb.toString());
    }
}
