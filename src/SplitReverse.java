/**
 * Created by Sammie on 11/1/2017.
 */
public class SplitReverse {

    static String reverse(String s) {

        if (s.length() % 2 != 0) {
            char c = s.charAt(s.length() / 2);
            s = new StringBuilder(s.substring(0, s.length() / 2)).reverse() + String.valueOf(c) + new StringBuilder(s.substring((s.length() / 2) + 1)).reverse();
        } else {
            s = new StringBuilder(s.substring(0, s.length() / 2)).reverse() + "" +  new StringBuilder(s.substring((s.length() / 2))).reverse();
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverse(s));
        s = "MIKE";
        System.out.println(reverse(s));
        s = "break";
        System.out.println(reverse(s));
    }
}
